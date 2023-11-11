package edu.princeton.cs.algs4.string.algorithms.longestrepeated;

import edu.princeton.cs.algs4.string.algorithms.search.SuffixArray;
import edu.princeton.cs.algs4.string.algorithms.longestcommon.LongestCommonSubstring;
import edu.princeton.cs.algs4.utils.StdIn;
import edu.princeton.cs.algs4.utils.StdOut;

/**
 *  The {@code LongestRepeatedSubstring} class provides a {@link SuffixArray}
 *  client for computing the longest repeated substring of a string that
 *  appears at least twice. The repeated substrings may overlap (but must
 *  be distinct).
 */
public class LongestRepeatedSubstring {

    // Do not instantiate.
    private LongestRepeatedSubstring() { }
    /**
     * Returns the longest repeated substring of the specified string.
     *
     * @param  text the string
     * @return the longest repeated substring that appears in {@code text};
     *         the empty string if no such string
     */
    public static String lrs(String text) {
        int textLength = text.length();
        SuffixArray suffixArray = new SuffixArray(text);
        String longestCommonSubstring = "";
        for (int position = 1; position < textLength; position++) {
            int length = suffixArray.lcp(position);
            if (length > longestCommonSubstring.length()) {
                // lrs = sa.select(i).substring(0, length);
                longestCommonSubstring = text.substring(suffixArray.index(position), suffixArray.index(position) + length);
            }
        }
        return longestCommonSubstring;
    }
}
