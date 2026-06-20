package dev.omatheus.dsa.dynamic_programming.medium;

/**
 * <a href="https://leetcode.com/problems/target-sum/">494. Target Sum</a> (Medium)
 *
 * <p>You are given an integer array nums and an integer target. You want to build an expression
 * out of nums by adding one of the symbols '+' and '-' before each integer in nums and then
 * concatenate all the integers. Return the number of different expressions that you can build,
 * which evaluates to target.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: nums = [1,1,1,1,1], target = 3
 * Output: 5
 * Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3: -1+1+1+1+1=3, +1-1+1+1+1=3, +1+1-1+1+1=3, +1+1+1-1+1=3, +1+1+1+1-1=3
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= nums.length <= 20</li>
 *   <li>0 <= nums[i] <= 1000</li>
 *   <li>0 <= sum(nums[i]) <= 1000</li>
 *   <li>-1000 <= target <= 1000</li>
 * </ul>
 *
 * @see TargetSumTest
 */
public class TargetSum {

    /**
     * Returns the number of expressions that evaluate to target.
     *
     * @param nums the array of integers
     * @param target the target sum
     * @return the number of expressions
     */
    public int findTargetSumWays(int[] nums, int target) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
