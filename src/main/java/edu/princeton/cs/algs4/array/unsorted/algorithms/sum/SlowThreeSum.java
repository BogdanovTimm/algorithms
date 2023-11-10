package edu.princeton.cs.algs4.array.unsorted.algorithms.sum;

/**
 * The {@code SlowThreeSum} class provides static methods for counting
 * and printing the number of triples in an array of integers that sum to 0
 * (ignoring integer overflow).
 * <p>
 * This implementation uses a triply nested loop and takes proportional to n^3,
 * where n is the number of integers.
 * <p>
 */
public class SlowThreeSum {

    // Do not instantiate.
    private SlowThreeSum() {
    }

    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param array the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] array) {
        int arrayLength = array.length;
        int count = 0;
        for (int position1 = 0; position1 < arrayLength; position1++) {
            for (int position2 = position1 + 1; position2 < arrayLength; position2++) {
                for (int position3 = position2 + 1; position3 < arrayLength; position3++) {
                    if (array[position1] + array[position2] + array[position3] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
