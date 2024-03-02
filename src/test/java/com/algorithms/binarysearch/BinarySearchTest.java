package com.algorithms.binarysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

public class BinarySearchTest {
    @Test
    @DisplayName("Find 4 in array: {1, 2, 3, 4, 5, 6, 7, 8}")
    public void shouldReturnFourAsFoundIndex() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertEquals(3, BinarySearch.search(numbers, 4));
    }

}
