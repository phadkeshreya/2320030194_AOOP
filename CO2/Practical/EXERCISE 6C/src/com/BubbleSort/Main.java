package com.BubbleSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {5, 3, 8, 4, 2};
        System.out.println("Original Integer array:");
        printArray(intArray);
        GenericBubbleSort.bubbleSort(intArray);
        System.out.println("Sorted Integer array:");
        printArray(intArray);

        Double[] doubleArray = {5.5, 2.2, 9.1, 3.3, 7.7};
        System.out.println("\nOriginal Double array:");
        printArray(doubleArray);
        GenericBubbleSort.bubbleSort(doubleArray);
        System.out.println("Sorted Double array:");
        printArray(doubleArray);

        String[] stringArray = {"banana", "apple", "cherry", "fig", "date"};
        System.out.println("\nOriginal String array:");
        printArray(stringArray);
        GenericBubbleSort.bubbleSort(stringArray);
        System.out.println("Sorted String array:");
        printArray(stringArray);
    }

    // Utility method to print array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
	}

}
