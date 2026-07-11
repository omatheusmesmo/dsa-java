package dev.omatheus.dsa.twopointers.easy;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid
 * Palindrome</a> (Easy)
 *
 * <p>
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and
 * backward.
 * </p>
 *
 * <p>
 * <strong>Example:</strong>
 * </p>
 *
 * <pre>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * </pre>
 *
 * <p>
 * <strong>Constraints:</strong>
 * </p>
 * <ul>
 * <li>1 <= s.length <= 2 * 10^5</li>
 * <li>s consists only of printable ASCII characters</li>
 * </ul>
 *
 * @see dev.omatheus.dsa.twopointers.easy.ValidPalindromeTest
 */
public class ValidPalindrome {

    /**
     * Determines if the given string is a palindrome after removing
     * non-alphanumeric characters
     * and ignoring case.
     *
     * @param s the input string
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
