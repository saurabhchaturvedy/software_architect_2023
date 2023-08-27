package DesignPatternAug2023.Behavioral.Observer;

public class Viewer1 extends Observer {


    Viewer1(CricketScore cricketScore) {
        this.score = cricketScore;
        this.score.addObservers(this);
    }

    @Override
    public void update() {

        System.out.println("Viewer 1 notified : " + score.getScoreboard());
    }
}
