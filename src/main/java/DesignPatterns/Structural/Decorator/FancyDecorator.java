package DesignPatterns.Structural.Decorator;

class FancyDecorator extends RoomDecorator {
    public FancyDecorator(Room room) {
        super(room);
    }

    @Override
    public String furnish() {
        return super.furnish() + " with fancy furnishings";
    }
}