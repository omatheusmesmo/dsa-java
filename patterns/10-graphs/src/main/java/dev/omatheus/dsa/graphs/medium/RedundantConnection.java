package dev.omatheus.dsa.graphs.medium;

/**
 * <a href="https://leetcode.com/problems/redundant-connection/">684. Redundant Connection</a> (Medium)
 *
 * <p>In this problem, a tree is an undirected graph that is connected and has no cycles. You are
 * given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge
 * added. The added edge has two different vertices chosen from 1 to n, and was not an edge that
 * already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi]
 * indicates that there is an edge between nodes ai and bi in the graph. Return an edge that can
 * be removed so that the resulting graph is a tree of n nodes.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: edges = [[1,2],[1,3],[2,3]]
 * Output: [2,3]
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>n == edges.length</li>
 *   <li>3 <= n <= 1000</li>
 *   <li>edges[i].length == 2</li>
 * </ul>
 *
 * @see RedundantConnectionTest
 */
public class RedundantConnection {

    /**
     * Finds the redundant connection that can be removed.
     *
     * @param edges array of [node1, node2] edges
     * @return the redundant edge
     */
    public int[] findRedundantConnection(int[][] edges) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
