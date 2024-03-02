package com.algorithms.binarysearch;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 44, 64, 66, 83, 123, 453 };
        int find = 44;

        Integer found = BinarySearch.search(numbers, find);

        if (found != null) {

            Stream<Integer> stream = Stream.iterate(0, i -> i < numbers.length, i -> ++i);
            String output = stream.map(i -> String.format("[Index:%d]:%d", i, numbers[i]))
                    .collect(Collectors.joining(", "));
            System.out.println(output);
            System.out.printf("Number found at index: %d", found);
        } else {
            System.out.printf("%d not found.", find);
        }

    }
}