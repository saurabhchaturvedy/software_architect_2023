package DesignPatterns.Structural.Adapter;

class MobilePhone {
    private Charger charger;

    MobilePhone(Charger charger) {
        this.charger = charger;
    }

    public void charge() {
        charger.charge();
    }
}