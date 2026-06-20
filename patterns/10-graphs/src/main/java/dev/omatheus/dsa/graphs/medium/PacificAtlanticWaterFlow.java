package dev.omatheus.dsa.graphs.medium;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pacific-atlantic-water-flow/">417. Pacific Atlantic Water Flow</a> (Medium)
 *
 * <p>There is an m x n rectangular island that borders both the Pacific Ocean and the Atlantic Ocean.
 * The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the
 * island's right and bottom edges. Rain water can flow in four directions (up, down, left, or
 * right) from a cell to an adjacent cell with an equal or lower height. Find the list of grid
 * coordinates where water can flow to both oceans.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
 * Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>m == heights.length</li>
 *   <li>n == heights[r].length</li>
 *   <li>1 <= m, n <= 200</li>
 *   <li>0 <= heights[r][c] <= 10^6</li>
 * </ul>
 *
 * @see PacificAtlanticWaterFlowTest
 */
public class PacificAtlanticWaterFlow {

    /**
     * Finds cells where water can flow to both oceans.
     *
     * @param heights the height matrix
     * @return list of [row, col] coordinates
     */
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
