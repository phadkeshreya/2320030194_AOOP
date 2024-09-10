package com.stackDs;

public class StackTest {
	public static void main(String[] args) {

        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);

        System.out.println("LinkedListStack (Integer):");
        System.out.println("Peek: " + linkedListStack.peek()); 
        System.out.println("Pop: " + linkedListStack.pop());   
        System.out.println("Pop: " + linkedListStack.pop());   
        System.out.println("Is empty: " + linkedListStack.isEmpty()); 
        System.out.println("Pop: " + linkedListStack.pop());   
        System.out.println("Is empty: " + linkedListStack.isEmpty()); 

        Stack<String> arrayStack = new ArrayStack<>();
        arrayStack.push("Hello");
        arrayStack.push("World");
        arrayStack.push("!");

        System.out.println("\nArrayStack (String):");
        System.out.println("Peek: " + arrayStack.peek());  
        System.out.println("Pop: " + arrayStack.pop());    
        System.out.println("Pop: " + arrayStack.pop());    
        System.out.println("Is empty: " + arrayStack.isEmpty()); 
        System.out.println("Pop: " + arrayStack.pop());    
        System.out.println("Is empty: " + arrayStack.isEmpty());
    }
}
