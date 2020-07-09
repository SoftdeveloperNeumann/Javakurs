package de.wbs.collections;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.add(3,100);
        System.out.println(stack.peek());
        System.out.println(stack.search(1));

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
