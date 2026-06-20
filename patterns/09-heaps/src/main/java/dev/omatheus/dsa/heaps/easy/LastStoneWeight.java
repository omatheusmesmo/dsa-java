package dev.omatheus.dsa.heaps.easy;

/**
 * <a href="https://leetcode.com/problems/last-stone-weight/">1046. Last Stone Weight</a> (Easy)
 *
 * <p>You are given an array of integers stones where stones[i] is the weight of the ith stone.
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash
 * them together. If the heaviest two stones have weights x and y with x <= y, the result is:
 * If x == y, both stones are destroyed. If x != y, the stone of weight x is destroyed, and the
 * stone of weight y has new weight y - x. At the end of the game, there is at most one stone left.
 * Return the weight of the last remaining stone. If there are no stones left, return 0.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation: We combine 7 and 8 to get 1, the array becomes [2,4,1,1,1] then [2,4,1,1] then [2,4,1] then [2,4] then [2].
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= stones.length <= 30</li>
 *   <li>1 <= stones[i] <= 1000</li>
 * </ul>
 *
 * @see LastStoneWeightTest
 */
public class LastStoneWeight {

    /**
     * Returns the weight of the last remaining stone.
     *
     * @param stones array of stone weights
     * @return the weight of the last stone, or 0 if none
     */
    public int lastStoneWeight(int[] stones) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
