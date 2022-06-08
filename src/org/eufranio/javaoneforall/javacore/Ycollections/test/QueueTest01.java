package org.eufranio.javaoneforall.javacore.Ycollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("C");
        queue.add("A");
        queue.add("B");

        queue.forEach(System.out::println);
        System.out.println("-------------------------");

        System.out.println(queue.peek());

        System.out.println("-------------------------");

        queue.forEach(System.out::println);

        System.out.println("-------------------------");

        System.out.println(queue.poll());


        System.out.println("-------------------------");

        queue.forEach(System.out::println);

        System.out.println("-------------------------");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


    }
}
