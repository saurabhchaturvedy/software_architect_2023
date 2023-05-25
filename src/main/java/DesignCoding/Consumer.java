package DesignCoding;

import java.util.List;

public class Consumer implements Runnable {

    List<String> buffer;

    Consumer(List<String> buffer)
    {
        this.buffer=buffer;
    }

    @Override
    public void run() {

        while (true) {
            if (buffer.isEmpty()) {
                continue;
            }

            if(buffer.get(0).equals("#"))
            {
                System.out.println(Thread.currentThread().getName()+" exiting ");
                break;
            }
            else {
                System.out.println(Thread.currentThread().getName()+" removed "+buffer.remove(0));
            }
        }
    }
}
