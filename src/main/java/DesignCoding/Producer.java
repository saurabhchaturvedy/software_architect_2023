package DesignCoding;

import com.sun.tools.javac.Main;

import java.util.List;

public class Producer implements Runnable {

    List<String> buffer;

    Producer(List<String> buffer)
    {
        this.buffer=buffer;
    }


    @Override
    public void run() {

        String[]data = {"1","2","3","4","5"};

        for(String item : data)
        {
            System.out.println(Thread.currentThread().getName()+" adding "+item);
            buffer.add(item);
        }

        System.out.println(Thread.currentThread().getName()+" adding #");
        buffer.add("#");
    }
}
