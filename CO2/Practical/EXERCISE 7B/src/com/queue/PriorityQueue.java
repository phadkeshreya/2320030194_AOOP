package com.queue;

import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<T> {
	 private ArrayList<T> heap;
	    private Comparator<? super T> comparator;

	    public PriorityQueue(Comparator<? super T> comparator) {
	        this.heap = new ArrayList<>();
	        this.comparator = comparator;
	    }

	    public void enqueue(T element) {
	        heap.add(element);
	        heapifyUp(heap.size() - 1);
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Priority queue is empty");
	        }

	        T topElement = heap.get(0);
	        T lastElement = heap.remove(heap.size() - 1);

	        if (!isEmpty()) {
	            heap.set(0, lastElement);
	            heapifyDown(0);
	        }

	        return topElement;
	    }

	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Priority queue is empty");
	        }
	        return heap.get(0);
	    }

	    public boolean isEmpty() {
	        return heap.isEmpty();
	    }

	    private void heapifyUp(int index) {
	        int parentIndex = (index - 1) / 2;

	        if (index > 0 && comparator.compare(heap.get(index), heap.get(parentIndex)) > 0) {
	            swap(index, parentIndex);
	            heapifyUp(parentIndex);
	        }
	    }

	    private void heapifyDown(int index) {
	        int leftChildIndex = 2 * index + 1;
	        int rightChildIndex = 2 * index + 2;
	        int largestIndex = index;

	        if (leftChildIndex < heap.size() && comparator.compare(heap.get(leftChildIndex), heap.get(largestIndex)) > 0) {
	            largestIndex = leftChildIndex;
	        }

	        if (rightChildIndex < heap.size() && comparator.compare(heap.get(rightChildIndex), heap.get(largestIndex)) > 0) {
	            largestIndex = rightChildIndex;
	        }

	        if (largestIndex != index) {
	            swap(index, largestIndex);
	            heapifyDown(largestIndex);
	        }
	    }

	    private void swap(int i, int j) {
	        T temp = heap.get(i);
	        heap.set(i, heap.get(j));
	        heap.set(j, temp);
	    }
}
