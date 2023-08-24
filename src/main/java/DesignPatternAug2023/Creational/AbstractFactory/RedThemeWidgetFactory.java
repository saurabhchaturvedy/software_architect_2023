package DesignPatternAug2023.Creational.AbstractFactory;

public class RedThemeWidgetFactory implements WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new RedThemeScrollbar();
    }

    @Override
    public Window createWindow() {
        return new RedThemeWindow();
    }
}
