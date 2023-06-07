package LowLevelDesign.Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    public static void main(String[] args) {
        // Create floors
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);

        // Create elevators
        Elevator elevator1 = new Elevator(1, floor1);
        Elevator elevator2 = new Elevator(2, floor3);

        // Create elevator control system
        List<Elevator> elevators = new ArrayList<>();
        elevators.add(elevator1);
        elevators.add(elevator2);

        ElevatorControlSystem elevatorControlSystem = new ElevatorControlSystem(elevators);

        // Make elevator requests
        elevatorControlSystem.requestElevator(floor2, Direction.UP);
        elevatorControlSystem.requestElevator(floor4, Direction.DOWN);
    }
}