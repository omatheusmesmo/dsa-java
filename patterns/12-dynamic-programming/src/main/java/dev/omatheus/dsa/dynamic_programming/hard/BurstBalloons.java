package dev.omatheus.dsa.dynamic_programming.hard;

/**
 * <a href="https://leetcode.com/problems/burst-balloons/">312. Burst Balloons</a> (Hard)
 *
 * <p>You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number
 * on it represented by an array nums. You are asked to burst all the balloons. If you burst the
 * ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes
 * out of bounds, then treat it as if there is a balloon with a 1 painted on it. Return the maximum
 * coins you can collect by bursting the balloons wisely.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: nums = [3,1,5,8]
 * Output: 167
 * Explanation: nums = [3,1,5,8] -> [3,5,8] -> [3,8] -> [8] -> [] coins = 3*1*5 + 3*5*8 + 1*3*8 + 8*1*1 = 167
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>n == nums.length</li>
 *   <li>1 <= n <= 300</li>
 *   <li>0 <= nums[i] <= 100</li>
 * </ul>
 *
 * @see BurstBalloonsTest
 */
public class BurstBalloons {

    /**
     * Returns the maximum coins obtainable.
     *
     * @param nums the balloon values
     * @return the maximum coins
     */
    public int maxCoins(int[] nums) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
