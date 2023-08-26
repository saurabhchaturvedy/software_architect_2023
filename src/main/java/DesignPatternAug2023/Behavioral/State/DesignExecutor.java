package DesignPatternAug2023.Behavioral.State;

public class DesignExecutor {


    public static void main(String[] args) throws Exception {

        TCPConnection tcpConnection = new TCPConnection();

        tcpConnection.open();

        tcpConnection.acknowledge();

        tcpConnection.close();
    }
}
