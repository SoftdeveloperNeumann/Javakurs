package de.wbs.threads;

public class ThreadForDoIt {

    public static void main(String[] args) {
        Runnable r = new DoIt();
        Thread t = new Thread(r,"Worker 1");
        Thread t2 = new Thread(r,"Worker 2");
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t2.start();

    }
}
