package DesignPatternAug2023.Structural.Decorator;

public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        System.out.println("Troll attacks :");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {

        System.out.println("Troll shrieks in horror and runs away !!! ");
    }
}
