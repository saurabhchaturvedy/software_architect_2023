package LowLevelDesign.Elevator;

class Request {
    private Floor floor;
    private Direction direction;

    Request(Floor floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public Floor getFloor() {
        return floor;
    }

    public Direction getDirection() {
        return direction;
    }
}