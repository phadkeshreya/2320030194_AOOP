package com.binarySearchGenerics;

public class BinarySearch<T extends Comparable<T>> {

    public int binarySearch(T[] array, T key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = key.compareTo(array[mid]);

            if (result == 0) {
                return mid;
            }
            if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
