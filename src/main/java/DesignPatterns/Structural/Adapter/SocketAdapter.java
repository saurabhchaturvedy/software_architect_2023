package DesignPatterns.Structural.Adapter;

class SocketAdapter implements Charger {
    private EuropeanSocket europeanSocket;

    SocketAdapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    public void charge() {
        europeanSocket.plugIn();
    }
}