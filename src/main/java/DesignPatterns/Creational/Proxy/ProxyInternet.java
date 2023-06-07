package DesignPatterns.Creational.Proxy;

import java.util.ArrayList;
import java.util.List;

class ProxyInternet implements Internet {
    private Internet realInternet;
    private List<String> blockedSites;

    ProxyInternet() {
        realInternet = new RealInternet();
        blockedSites = new ArrayList<>();
        blockedSites.add("blockedSite1.com");
        blockedSites.add("blockedSite2.com");
        blockedSites.add("blockedSite3.com");
    }

    public void connectTo(String serverHost) {
        if (blockedSites.contains(serverHost)) {
            System.out.println("Access to " + serverHost + " is blocked.");
        } else {
            realInternet.connectTo(serverHost);
        }
    }
}