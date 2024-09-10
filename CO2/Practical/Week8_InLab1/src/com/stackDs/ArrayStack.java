package com.stackDs;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
	private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int top;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        array = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T element) {
        if (top == array.length - 1) {
            // Resize array if it's full
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
