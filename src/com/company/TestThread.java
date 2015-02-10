package com.company;

import java.io.IOException;

import static java.lang.System.out;

/**
 * Created by Szymon on 2015-02-10.
 */
public class TestThread implements Runnable{
    private Thread x;
    private String threadName;

    TestThread(String tN){
        threadName = tN;
        out.println("Utworzono wątek: " + threadName);
    }

    public void run(){
        out.println("Uruchomiono wątek: " + threadName);
        try {
            for (int i = 0; i < 8; i++) {
                out.println("Pracuje wątek: " + threadName + " - " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            out.println("Wątek: " + threadName + " został przrwany!!!");
        }
        out.println("Wątek: " + threadName + " zakończył pracę");
    }

    public void start(){
        out.println("Wystartował wątek: " + threadName);
        //To zabezpieczenie- jesli wątek z jakiegoś powodu nie wystartuje bo nie zostanie wcześniej utworzony
        if (x == null){
            x = new Thread(this, threadName);
            x.start();
        }
    }
}
