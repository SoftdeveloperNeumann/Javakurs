package de.wbs.threads.lager;

public class Produzent implements Runnable{
    Lager l;
    ThreadGroup tg;

    public Produzent(Lager l, ThreadGroup tg){
        this.l = l;
        this.tg = tg;
    }
    @Override
    public void run() {

        synchronized (l) {
            while(l.getValue() != null){
                try {
                    l.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            l.setValue("Hallo");
            l.notify();

        }
    }
}
