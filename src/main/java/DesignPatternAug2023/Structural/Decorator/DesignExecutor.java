package DesignPatternAug2023.Structural.Decorator;

public class DesignExecutor {


    public static void main(String[] args) {

        Troll simpleTroll = new SimpleTroll();

        simpleTroll.attack();
        System.out.println("Simple troll attack power level is : " + simpleTroll.getAttackPower());
        simpleTroll.fleeBattle();


        System.out.println("Game level up ...TROLL getting upgraded with a surprising weapon...!!!");
        System.out.println();

        Troll clubbedTroll = new ClubbedTroll(simpleTroll);
        clubbedTroll.attack();
        System.out.println("Clubbed troll attack power level is : " + clubbedTroll.getAttackPower());
        clubbedTroll.fleeBattle();
    }
}
