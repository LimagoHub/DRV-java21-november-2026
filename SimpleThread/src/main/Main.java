package main;

import simplethread.SimpleThread;

public class Main {

    public static void main(String[] args) throws Exception {
        SimpleThread hund = new SimpleThread("wau");
        SimpleThread katze = new SimpleThread("miau");
        SimpleThread maus = new SimpleThread("piep");

        Thread t1 = new Thread(hund);
        Thread t2 = new Thread(katze);
        Thread t3 = new Thread(maus);

        t1.start();
        t2.start();
        t2.join();
        t3.start();
    }
}
