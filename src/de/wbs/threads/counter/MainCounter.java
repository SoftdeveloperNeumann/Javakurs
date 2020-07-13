package de.wbs.threads.counter;

public class MainCounter {

    public static void main(String[] args) {
        Counter count = new Counter();
        Runnable a = new Addiere(count);
        Runnable s = new Subtrahiere(count);
        Thread add = new Thread(a);
        Thread sub = new Thread(s);
        add.start();
        sub.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count.getCount());
    }
}
