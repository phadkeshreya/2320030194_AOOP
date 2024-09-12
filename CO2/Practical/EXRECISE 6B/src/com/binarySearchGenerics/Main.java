package com.binarySearchGenerics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch<Integer> integerSearch = new BinarySearch<>();
        Integer[] intArray = {1, 3, 5, 7, 9, 11};
        int intResult = integerSearch.binarySearch(intArray, 7);
        System.out.println("Integer 7 found at index: " + intResult);

        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        int doubleResult = doubleSearch.binarySearch(doubleArray, 3.3);
        System.out.println("Double 3.3 found at index: " + doubleResult);

        BinarySearch<String> stringSearch = new BinarySearch<>();
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        int stringResult = stringSearch.binarySearch(stringArray, "cherry");
        System.out.println("String 'cherry' found at index: " + stringResult);
	}

}
