package DesignPatternAug2023.Behavioral.State;

public class OpenTCPConnectionState implements TCPConnectionState {

    TCPConnection tcpConnection;

    OpenTCPConnectionState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {

        System.out.println("Re-initializing connection...");
    }

    @Override
    public void close() {

        tcpConnection.setTCPConnectionState(new ClosedTCPConnectionState(tcpConnection));
        System.out.println("Connection closed...");
    }

    @Override
    public void acknowledge() throws Exception {

        System.out.println("Acknowledged...");
    }
}
