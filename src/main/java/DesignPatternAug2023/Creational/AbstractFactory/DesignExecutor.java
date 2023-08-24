package DesignPatternAug2023.Creational.AbstractFactory;

public class DesignExecutor {


    public static void main(String[] args) {

        WidgetFactory widgetFactory = new BlueThemeWidgetFactory();

        widgetFactory.createScrollbar();
    }
}
