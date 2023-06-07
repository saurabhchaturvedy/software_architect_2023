package DesignPatterns.Structural.Decorator;

class PaintedDecorator extends RoomDecorator {
    public PaintedDecorator(Room room) {
        super(room);
    }

    @Override
    public String furnish() {
        return super.furnish() + " with painted walls";
    }
}