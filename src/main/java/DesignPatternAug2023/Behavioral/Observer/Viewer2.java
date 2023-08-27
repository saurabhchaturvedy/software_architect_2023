package DesignPatternAug2023.Behavioral.Observer;

public class Viewer2 extends Observer {


    Viewer2(CricketScore cricketScore) {
        this.score = cricketScore;
        this.score.addObservers(this);
    }

    @Override
    public void update() {

        System.out.println("Viewer 2 notified : " + score.getScoreboard());
    }
}
