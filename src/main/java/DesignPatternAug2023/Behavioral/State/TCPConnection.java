package DesignPatternAug2023.Behavioral.State;

public class TCPConnection {


    private TCPConnectionState tcpConnectionState = new ClosedTCPConnectionState(this);

    public void open() {

        tcpConnectionState.open();
    }

    public void close() {

        tcpConnectionState.close();
    }

    public void acknowledge() throws Exception {

        tcpConnectionState.acknowledge();
    }

    public void setTCPConnectionState(TCPConnectionState tcpConnectionState) {
        this.tcpConnectionState = tcpConnectionState;
    }
}
