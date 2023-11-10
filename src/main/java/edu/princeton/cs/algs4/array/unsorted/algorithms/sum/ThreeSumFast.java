package edu.princeton.cs.algs4.array.unsorted.algorithms.sum;

import java.util.Arrays;

/**
 * Return number of sets of 3 integers in an array without duplicate integers that sum to 0.
 * <p>
 * This implementation uses sorting and binary search and takes {@code O(arraySize^2 * log(arraySize)}
 */
public class ThreeSumFast {

    // Do not instantiate.
    private ThreeSumFast() {
    }

    public static int count(int[] array) {
        int arrayLength = array.length;
        Arrays.sort(array);
        if (whetherContainsDuplicates(array)) {
            throw new IllegalArgumentException("array contains duplicate integers");
        }
        int counter = 0;
        for (int position1 = 0; position1 < arrayLength; position1++) {
            for (int position2 = position1 + 1; position2 < arrayLength; position2++) {
                int position3 = Arrays.binarySearch(array, -(array[position1] + array[position2]));
                if (position3 > position2)
                    counter++;
            }
        }
        return counter;
    }

    private static boolean whetherContainsDuplicates(int[] array) {
        for (int position = 1; position < array.length; position++) {
            if (array[position] == array[position - 1])
                return true;
        }
        return false;
    }
}

