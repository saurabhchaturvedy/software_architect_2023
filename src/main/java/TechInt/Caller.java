package TechInt;

public class Caller implements Runnable {


    CallMe target;
    String msg;
    Thread t;


    Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();

    }


    @Override
    public void run() {
// you can use synchronized block to synchronize access to the Call method of an instance of Callme object
        synchronized (target) {
            target.Call(msg);
        }
    }
}
