package TechInt;

public class CallMe {


    public void Call(String msg) {

        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("interrupt");
        }
        System.out.print("]");
    }
}
