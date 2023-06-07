package DesignPatterns.Structural.Proxy;

class RealInternet implements Internet {
    public void connectTo(String serverHost) {
        System.out.println("Connecting to server: " + serverHost);
    }
}
