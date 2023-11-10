package edu.princeton.cs.algs4.array.sorted.algorithms.search;

/**
 * The <em>indexOf</em> operations takes logarithmic time in the worst case.
 */
public class BinarySearch {

    /**
     * This class should not be instantiated.
     */
    private BinarySearch() {
    }

    /**
     * Returns the index of a given integer in a given sorted array.
     */
    public static int indexOf(int[] sortedArray, int intToFind) {
        int leftPosition = 0;
        int rightPosition = sortedArray.length - 1;
        while (leftPosition <= rightPosition) {
            int midPosition = leftPosition + (rightPosition - leftPosition) / 2;
            if (intToFind < sortedArray[midPosition]) {
                rightPosition = midPosition - 1;
            }
            else if (intToFind > sortedArray[midPosition]) {
                leftPosition = midPosition + 1;
            }
            else {
                return midPosition;
            }
        }
        return -1;
    }
}
