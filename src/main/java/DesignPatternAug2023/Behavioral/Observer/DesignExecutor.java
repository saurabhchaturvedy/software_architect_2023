package DesignPatternAug2023.Behavioral.Observer;

public class DesignExecutor {


    public static void main(String[] args) {


        CricketScore cricketScore = new CricketScore();

        Viewer1 viewer1 = new Viewer1(cricketScore);
        Viewer2 viewer2 = new Viewer2(cricketScore);

        Scoreboard scoreboard = new Scoreboard();
        scoreboard.setRuns(50);
        scoreboard.setWickets(2);

        cricketScore.setScoreboard(scoreboard);
    }
}
