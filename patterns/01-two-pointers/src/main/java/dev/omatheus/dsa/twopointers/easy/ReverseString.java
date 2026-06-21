package dev.omatheus.dsa.twopointers.easy;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a> (Easy)
 *
 * <p>Write a function that reverses a string. The input string is given as an array of characters
 * {@code s}. You must do this in-place by modifying the input array.
 *
 * <p><strong>Example:</strong>
 *
 * <pre>
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * </pre>
 *
 * <p><strong>Constraints:</strong>
 *
 * <ul>
 *   <li>1 <= s.length <= 10^5
 *   <li>s[i] is a printable ascii character
 * </ul>
 *
 * @see dev.omatheus.dsa.twopointers.easy.ReverseStringTest
 */
public class ReverseString {

    /**
     * Reverses the character array in-place.
     *
     * @param s the character array to reverse
     */
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
