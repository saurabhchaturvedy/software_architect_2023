package DesignPatterns.Structural.Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocket();
        SocketAdapter adapter = new SocketAdapter(europeanSocket);

        MobilePhone mobilePhone = new MobilePhone(adapter);
        mobilePhone.charge();
    }
}