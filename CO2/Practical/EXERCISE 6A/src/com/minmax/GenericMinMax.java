package com.minmax;

public class GenericMinMax {

	public static void main(String[] args) {
		Integer[] intArray = {3, 5, 1, 8, 2};
        MinMax<Integer> intMinMax = new MinMax<>();
        System.out.println("Integer Array - Min: " + intMinMax.findMin(intArray));
        System.out.println("Integer Array - Max: " + intMinMax.findMax(intArray));

        // String array
        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMax<String> strMinMax = new MinMax<>();
        System.out.println("String Array - Min: " + strMinMax.findMin(strArray));
        System.out.println("String Array - Max: " + strMinMax.findMax(strArray));

        // Character array
        Character[] charArray = {'A', 'Z', 'K', 'M'};
        MinMax<Character> charMinMax = new MinMax<>();
        System.out.println("Character Array - Min: " + charMinMax.findMin(charArray));
        System.out.println("Character Array - Max: " + charMinMax.findMax(charArray));

        // Float array
        Float[] floatArray = {3.2f, 1.5f, 4.8f, 2.9f};
        MinMax<Float> floatMinMax = new MinMax<>();
        System.out.println("Float Array - Min: " + floatMinMax.findMin(floatArray));
        System.out.println("Float Array - Max: " + floatMinMax.findMax(floatArray));
    }
}