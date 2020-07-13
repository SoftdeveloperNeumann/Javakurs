package de.wbs.threads;

public class MyJoin {
   static String name = null;

    public static void main(String[] args) {
        Thread t = new Thread(()->{
            try {
                Thread.sleep(5000);

                name = "Frank";
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        try {
            t.join(10000000);
            if(name==null){
                name = "DefaultInfo";
            }

            System.out.println(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
