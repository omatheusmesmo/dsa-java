package dev.omatheus.dsa.dynamic_programming.medium;

/**
 * <a href="https://leetcode.com/problems/interleaving-string/">97. Interleaving String</a> (Medium)
 *
 * <p>Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 * An interleaving of two strings s1 and s2 is a configuration where they are divided into
 * non-empty substrings such that s1 = s11 + s12 + ... + s1x, s2 = s21 + s22 + ... + s2y, and
 * s3 = s11 + s21 + s12 + s22 + ... or s3 = s21 + s11 + s22 + s12 + ... where |s11| + |s21| + ... = |s1|
 * and |s12| + |s22| + ... = |s2|.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * Output: true
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>0 <= s1.length, s2.length <= 100</li>
 *   <li>0 <= s3.length <= 200</li>
 * </ul>
 *
 * @see InterleavingStringTest
 */
public class InterleavingString {

    /**
     * Checks if s3 is formed by interleaving s1 and s2.
     *
     * @param s1 the first string
     * @param s2 the second string
     * @param s3 the potential interleaved string
     * @return true if s3 is an interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
