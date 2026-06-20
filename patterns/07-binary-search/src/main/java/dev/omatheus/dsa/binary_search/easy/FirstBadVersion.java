package dev.omatheus.dsa.binary_search.easy;

/**
 * <a href="https://leetcode.com/problems/first-bad-version/">278. First Bad Version</a> (Easy)
 *
 * <p>You are a product manager and you are leading a team to develop a new product. Unfortunately,
 * the latest version of your product fails the quality check. Since each version is developed based
 * on the previous version, all the versions after a bad version are also bad.</p>
 *
 * <p>Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
 * causes all the following ones to be bad. You are given an API bool isBadVersion(version) which
 * will return whether version is bad.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Therefore, 4 is the first bad version.
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= bad <= n <= 2^31 - 1</li>
 * </ul>
 *
 * @see FirstBadVersionTest
 */
public class FirstBadVersion {

    /**
     * Finds the first bad version.
     *
     * @param n the total number of versions
     * @return the first bad version
     */
    public int firstBadVersion(int n) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Simulated API call. In real LeetCode, this is provided by the judge.
     */
    protected boolean isBadVersion(int version) {
        throw new UnsupportedOperationException("Simulated - provided by LeetCode judge");
    }
}
