package de.wbs.threads.counter;

public class Subtrahiere implements Runnable{
    Counter c = null;

    Subtrahiere(Counter c){
        this.c = c;
    }
    @Override
    public void run() {
        synchronized (c) {
            int i = c.getCount();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
            c.setCount(i);

        }

    }
}
