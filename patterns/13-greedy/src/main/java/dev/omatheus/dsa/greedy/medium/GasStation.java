package dev.omatheus.dsa.greedy.medium;

/**
 * <a href="https://leetcode.com/problems/gas-station/">134. Gas Station</a> (Medium)
 *
 * <p>Given gas and cost arrays, return the starting gas station's index if you can travel
 * around the circuit once, otherwise return -1.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
 * Output: 3
 * Explanation: Start at station 3 (index 3). Total gas = 0, total cost = 0.
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>n == gas.length == cost.length</li>
 *   <li>1 <= n <= 10^4</li>
 *   <li>0 <= gas[i], cost[i] <= 10^4</li>
 * </ul>
 *
 * @see GasStationTest
 */
public class GasStation {

    /**
     * Returns the starting gas station index if a complete circuit is possible.
     *
     * @param gas  the amount of gas at each station
     * @param cost the gas cost to travel to the next station
     * @return the starting index, or -1 if impossible
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
