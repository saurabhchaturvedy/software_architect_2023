package DesignPatternAug2023.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class CricketScore {


    List<Observer> observers = new ArrayList<>();

    Scoreboard scoreboard;

    public String getScoreboard() {
        return scoreboard.getRuns() + "/" + scoreboard.getWickets();
    }

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
        notifyObservers();
    }


    public void addObservers(Observer observer) {
        this.observers.add(observer);
    }


    public void removeObservers(Observer observer) {
        this.observers.remove(observer);
    }


    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
