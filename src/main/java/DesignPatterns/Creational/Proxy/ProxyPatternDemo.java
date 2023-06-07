package DesignPatterns.Creational.Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        // Access allowed sites
        internet.connectTo("google.com");
        internet.connectTo("yahoo.com");

        // Access blocked sites
        internet.connectTo("blockedSite1.com");
        internet.connectTo("blockedSite2.com");
    }
}