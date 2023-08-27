package DesignPatternAug2023.Behavioral.Mediator;

public interface AircraftMediator {


    void registerRunway(Runway runway);

    String allocateRunwayTo(Aircraft aircraft);

    void releaseRunwayOccupiedBy(Aircraft aircraft);
}
