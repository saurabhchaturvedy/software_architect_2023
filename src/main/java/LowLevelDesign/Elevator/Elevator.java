package LowLevelDesign.Elevator;

class Elevator {
    private int elevatorId;
    private Floor currentFloor;
    private Direction currentDirection;
    private boolean isMoving;

    Elevator(int elevatorId, Floor initialFloor) {
        this.elevatorId = elevatorId;
        this.currentFloor = initialFloor;
        this.currentDirection = Direction.IDLE;
        this.isMoving = false;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void move(Direction direction) {
        currentDirection = direction;
        isMoving = true;
        // Code to move the elevator to the next floor
        // ...
        // Once the elevator reaches the destination floor, update the current floor and direction accordingly
        // ...
        isMoving = false;
    }
}