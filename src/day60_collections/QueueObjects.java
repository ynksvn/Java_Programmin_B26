package day60_collections;

import day51_inheritance.access.a.First;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        //queue.get() - get method is from list
        System.out.println(queue);

     //   System.out.println(new PriorityQueue<>().remove());
        // This causes exception because there is no elements
        System.out.println(new PriorityQueue<>().poll());
        //it will return null
        //Queue: First Come First Served


    }
}
