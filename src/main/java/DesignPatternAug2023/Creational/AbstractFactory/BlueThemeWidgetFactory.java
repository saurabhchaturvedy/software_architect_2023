package DesignPatternAug2023.Creational.AbstractFactory;

public class BlueThemeWidgetFactory implements WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new BlueThemeScrollbar();
    }

    @Override
    public Window createWindow() {
        return new BlueThemeWindow();
    }
}
