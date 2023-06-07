package LowLevelDesign.Elevator;

import java.util.ArrayList;
import java.util.List;

class ElevatorControlSystem {
    private List<Elevator> elevators;
    private List<Request> requests;

    ElevatorControlSystem(List<Elevator> elevators) {
        this.elevators = elevators;
        this.requests = new ArrayList<>();
    }

    public void requestElevator(Floor floor, Direction direction) {
        requests.add(new Request(floor, direction));
        processRequests();
    }

    private void processRequests() {
        for (Request request : requests) {
            Elevator selectedElevator = null;
            int minDistance = Integer.MAX_VALUE;

            // Find the elevator that is closest to the requested floor and moving in the same direction
            for (Elevator elevator : elevators) {
                if (!elevator.isMoving() && elevator.getCurrentFloor().getFloorNumber() == request.getFloor().getFloorNumber()) {
                    selectedElevator = elevator;
                    break;
                } else if (elevator.getCurrentDirection() == request.getDirection()) {
                    int distance = Math.abs(elevator.getCurrentFloor().getFloorNumber() - request.getFloor().getFloorNumber());
                    if (distance < minDistance) {
                        selectedElevator = elevator;
                        minDistance = distance;
                    }
                }
            }

            if (selectedElevator != null) {
                selectedElevator.move(request.getDirection());
                requests.remove(request);
            }
        }
    }
}