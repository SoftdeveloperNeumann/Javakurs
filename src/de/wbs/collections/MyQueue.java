package de.wbs.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayBlockingQueue<>(3);
        q.add(2);
        q.add(4);
        q.add(3);
        q.offer(1);
        q.offer(5);
        q.offer(0);

//        System.out.println(q.size());
//        System.out.println("element: " + q.element());
//        System.out.println(q.size());
//        System.out.println("peek: " + q.peek());
//        System.out.println(q.size());
//        System.out.println("poll:" + q.poll());
//        System.out.println(q.size());
//        System.out.println(q.peek());
        int count = q.size();
        for(int i = 0 ; i<count;i++){
            System.out.println(q.poll());
        }
//        for(int i : q){
//            System.out.println(i);
//
//        }
        System.out.println("size: " + q.size());
    }
}

class Sort implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}
