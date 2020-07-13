package de.wbs.threads;

public class DoIt implements Runnable {
    @Override
    public void run() {
        System.out.println("Info aus Runnable");
        System.out.println(Thread.currentThread().getName());
        int i = 0;
        while (i++ <10){
            long start = System.currentTimeMillis();
            try {
                if(Thread.currentThread().getName().equals("Worker 1")){
                    Thread.yield();
                }
                Thread.sleep(1000);
                long stop = System.currentTimeMillis();
                System.out.println(Thread.currentThread().getName() + " time: " + (stop-start));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
