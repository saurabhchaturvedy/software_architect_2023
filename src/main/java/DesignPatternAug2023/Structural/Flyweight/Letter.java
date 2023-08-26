package DesignPatternAug2023.Structural.Flyweight;

public class Letter {


    String value;

    Letter(String value) {
        System.out.println("Letter created with value : " + value);
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
