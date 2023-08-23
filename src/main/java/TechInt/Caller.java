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

        target.Call(msg);
    }
}
