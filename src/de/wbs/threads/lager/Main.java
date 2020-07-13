package de.wbs.threads.lager;

public class Main {

    public static void main(String[] args) {
        Lager l = new Lager();
        ThreadGroup tg = new ThreadGroup("Verbraucher");
        Produzent p = new Produzent(l,tg);
        Thread produzent = new Thread(p);
        Verbraucher v = new Verbraucher(l);
        Thread[] vT = new Thread[10];
        for(int i=0 ; i<vT.length;i++){
            vT[i]= new Thread(tg,v);
            vT[i].start();
        }
        produzent.start();
    }
}
