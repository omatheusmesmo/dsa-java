package dev.omatheus.dsa.hashing.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate-ii/">219. Contains Duplicate II</a> (Medium)
 *
 * <p>Given an integer array {@code nums} and an integer {@code k}, return true if there are two
 * distinct indices {@code i} and {@code j} in the array such that {@code nums[i] == nums[j]}
 * and {@code abs(i - j) <= k}.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= nums.length <= 10^5</li>
 *   <li>-10^9 <= nums[i] <= 10^9</li>
 *   <li>0 <= k <= 10^5</li>
 * </ul>
 *
 * @see dev.omatheus.dsa.hashing.medium.ContainsDuplicateIITest
 */
public class ContainsDuplicateII {

    /**
     * Checks if there exist two distinct indices with same value within distance k.
     *
     * @param nums the input array
     * @param k    the maximum distance between indices
     * @return true if such pair exists
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
