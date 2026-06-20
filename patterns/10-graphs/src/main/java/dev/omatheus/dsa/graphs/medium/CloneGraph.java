package dev.omatheus.dsa.graphs.medium;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/clone-graph/">133. Clone Graph</a> (Medium)
 *
 * <p>Given a reference of a node in a connected undirected graph, return a deep copy of the graph.
 * Each node contains a value (int) and a list of its neighbors. The graph is given as an adjacency
 * list.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 * Output: [[2,4],[1,3],[2,4],[1,3]]
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>The number of nodes in the graph is in the range [0, 100]</li>
 *   <li>1 <= Node.val <= 100</li>
 *   <li>Node.val is unique for each node</li>
 *   <li>All the edges are undirected</li>
 * </ul>
 *
 * @see CloneGraphTest
 */
public class CloneGraph {

    /**
     * Clones the graph.
     *
     * @param node a node in the graph
     * @return a deep copy of the graph
     */
    public Node cloneGraph(Node node) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Node class for the graph.
     */
    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }
}
