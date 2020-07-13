package de.wbs.threads;



public class FirstThread extends Thread{

    public FirstThread(){
        super();
    }
    public FirstThread(String first) {
        super((first));
    }

    public FirstThread(Runnable target) {
        super(target);
    }

    public FirstThread(Runnable target, String name) {
        super(target, name);
    }

    public static void main(String[] args) {
        Thread t = new FirstThread("first");
        System.out.println(Thread.currentThread().getName());
        System.out.println("erster stateaufruf: " + t.getState());
        t.run();
        System.out.println("zweiter stateaufruf: " + t.getState());
        t.start();
        System.out.println("dritte stateaufruf: " + t.getState());
    }

    public void run(){
        System.out.println(getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(getName());
    }
}
