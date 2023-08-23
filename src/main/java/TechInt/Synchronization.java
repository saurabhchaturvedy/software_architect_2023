package TechInt;

public class Synchronization {


    public static void main(String[] args) {
        CallMe callMe = new CallMe();
        String msg = "World Cup 2023";


        Caller caller1 = new Caller(callMe, msg);
        Caller caller2 = new Caller(callMe, msg);


        try {
            caller1.t.join();
            caller2.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
