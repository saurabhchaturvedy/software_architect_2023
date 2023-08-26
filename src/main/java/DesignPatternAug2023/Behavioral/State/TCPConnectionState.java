package DesignPatternAug2023.Behavioral.State;

public interface TCPConnectionState {


    void open();

    void close();

    void acknowledge() throws Exception;
}
