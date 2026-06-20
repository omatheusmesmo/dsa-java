package dev.omatheus.dsa.graphs.medium;

/**
 * <a href="https://leetcode.com/problems/number-of-provinces/">547. Number of Provinces</a> (Medium)
 *
 * <p>There are n cities. Some of them are connected, while some are not. If city a is connected
 * directly with city b, and city b is connected directly with city c, then city a is connected
 * indirectly with city c. A province is a group of directly or indirectly connected cities and
 * no other cities outside of the group. Given the n x n matrix isConnected where isConnected[i][j]
 * = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise,
 * return the number of provinces.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 * Output: 2
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= n <= 200</li>
 *   <li>n == isConnected.length</li>
 *   <li>n == isConnected[i].length</li>
 *   <li>isConnected[i][j] is 1 or 0</li>
 *   <li>isConnected[i][i] == 1</li>
 *   <li>isConnected[i][j] == isConnected[j][i]</li>
 * </ul>
 *
 * @see NumberOfProvincesTest
 */
public class NumberOfProvinces {

    /**
     * Finds the number of provinces.
     *
     * @param isConnected the connectivity matrix
     * @return the number of provinces
     */
    public int findCircleNum(int[][] isConnected) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
