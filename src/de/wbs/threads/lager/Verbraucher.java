package de.wbs.threads.lager;

public class Verbraucher implements Runnable{

    Lager l;


    public Verbraucher(Lager l){
        this.l = l;
    }
    @Override
    public void run() {
        synchronized (l) {
            while (l.getValue() == null) {
                try {
                    l.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String str = l.getValue();
            l.setValue(null);
            System.out.println(Thread.currentThread().getName() + " " + str);
            l.notifyAll();
        }
    }
}
