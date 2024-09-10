package com.queue;

import java.util.Comparator;

public class PriorityQueueTest {
	public static void main(String[] args) {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
        intQueue.enqueue(5);
        intQueue.enqueue(3);
        intQueue.enqueue(8);
        intQueue.enqueue(1);
        System.out.println("Integer Priority Queue (Max-Heap):");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());  
        }

        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.reverseOrder());
        doubleQueue.enqueue(2.5);
        doubleQueue.enqueue(7.3);
        doubleQueue.enqueue(1.1);
        doubleQueue.enqueue(9.9);
        System.out.println("\nDouble Priority Queue (Min-Heap):");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.dequeue()); 
        }

        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.reverseOrder());
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Cherry");
        stringQueue.enqueue("Date");
        System.out.println("\nString Priority Queue (Min-Heap):");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue()); 
        }
    }
}
