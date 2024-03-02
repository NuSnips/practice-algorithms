package com.algorithms.binarysearch;

public class BinarySearch {
    public static Integer search(int[] numbersList, int item) {

        int low = 0, high = numbersList.length - 1, mid = 0;

        while (low <= high) {

            mid = (low + high) / 2;
            int guess = numbersList[mid];

            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
