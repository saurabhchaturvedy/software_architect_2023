package DesignPatternAug2023.Structural.Decorator;

public class ClubbedTroll implements Troll {

    Troll decorated;

    ClubbedTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println("Troll attacks with a huge club !!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 15;
    }

    @Override
    public void fleeBattle() {

        decorated.fleeBattle();
    }
}
