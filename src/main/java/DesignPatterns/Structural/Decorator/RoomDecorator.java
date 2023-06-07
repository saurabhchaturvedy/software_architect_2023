package DesignPatterns.Structural.Decorator;

abstract class RoomDecorator implements Room {
    protected Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public String furnish() {
        return room.furnish();
    }
}