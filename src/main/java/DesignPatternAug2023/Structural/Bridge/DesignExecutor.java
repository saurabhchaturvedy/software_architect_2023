package DesignPatternAug2023.Structural.Bridge;

public class DesignExecutor {


    public static void main(String[] args) {

        IconWindow window = new IconWindow();

        LinuxWindowImpl linuxWindow = new LinuxWindowImpl();
        window.setWindow(linuxWindow);
        window.drawIcon();

        DirectXWindowImpl directXWindow = new DirectXWindowImpl();
        window.setWindow(directXWindow);
        window.drawIcon();

    }
}
