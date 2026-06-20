package dev.omatheus.dsa.stacks.hard;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/car-fleet/">853. Car Fleet</a> (Hard)
 *
 * <p>There are {@code n} cars going to the same destination along a one-lane road. The destination
 * is {@code target} miles away. Each car has a different speed and starting position. A car fleet
 * is a non-empty set of cars driving at the same position and same speed.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
 * Output: 3
 * Explanation: Cars at positions 10 and 8 form a fleet (arrive at time 1).
 * Car at position 5 forms a fleet (arrive at time 2).
 * Cars at positions 3 and 0 form a fleet (arrive at time 4).
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= n <= 10^5</li>
 *   <li>0 < target <= 10^6</li>
 *   <li>0 <= position[i] < target</li>
 *   <li>0 < speed[i] <= 10^6</li>
 * </ul>
 *
 * @see dev.omatheus.dsa.stacks.hard.CarFleetTest
 */
public class CarFleet {

    /**
     * Calculates the number of car fleets that arrive at the target.
     *
     * @param target   the destination distance
     * @param position the starting positions of cars
     * @param speed    the speeds of cars
     * @return the number of car fleets
     */
    public int carFleet(int target, int[] position, int[] speed) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
