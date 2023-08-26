package DesignPatternAug2023.Behavioral.State;

public class ClosedTCPConnectionState implements TCPConnectionState {


    TCPConnection tcpConnection;

    ClosedTCPConnectionState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        tcpConnection.setTCPConnectionState(new OpenTCPConnectionState(tcpConnection));
        System.out.println("connection opened...");
    }

    @Override
    public void close() {
        System.out.println("Connection already closed");
    }

    @Override
    public void acknowledge() throws Exception {
        System.out.println("Invalid use of Connection");
    }
}
