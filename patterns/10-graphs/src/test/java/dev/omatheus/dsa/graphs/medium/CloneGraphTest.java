package dev.omatheus.dsa.graphs.medium;

import dev.omatheus.dsa.graphs.medium.CloneGraph.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class CloneGraphTest {

    private final CloneGraph solution = new CloneGraph();

    @Test
    void basicClone() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors = List.of(node2, node4);
        node2.neighbors = List.of(node1, node3);
        node3.neighbors = List.of(node2, node4);
        node4.neighbors = List.of(node1, node3);

        Node clone = solution.cloneGraph(node1);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertEquals(2, clone.neighbors.size());
        assertNotSame(node1, clone);
    }

    @Test
    void emptyGraph() {
        assertNull(solution.cloneGraph(null));
    }

    @Test
    void singleNode() {
        Node node = new Node(1);
        Node clone = solution.cloneGraph(node);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertTrue(clone.neighbors.isEmpty());
        assertNotSame(node, clone);
    }

    @Test
    void linearGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.neighbors = new ArrayList<>(List.of(node2));
        node2.neighbors = new ArrayList<>(List.of(node1, node3));
        node3.neighbors = new ArrayList<>(List.of(node2));

        Node clone = solution.cloneGraph(node1);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertEquals(1, clone.neighbors.size());
        assertEquals(2, clone.neighbors.get(0).val);
    }

    @Test
    void cycleGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.neighbors = new ArrayList<>(List.of(node2));
        node2.neighbors = new ArrayList<>(List.of(node1));

        Node clone = solution.cloneGraph(node1);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertNotSame(node1, clone);
        assertNotSame(node2, clone.neighbors.get(0));
    }

    @Test
    void complexGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.neighbors = new ArrayList<>(List.of(node2, node5));
        node2.neighbors = new ArrayList<>(List.of(node1, node3));
        node3.neighbors = new ArrayList<>(List.of(node2, node4));
        node4.neighbors = new ArrayList<>(List.of(node3, node5));
        node5.neighbors = new ArrayList<>(List.of(node1, node4));

        Node clone = solution.cloneGraph(node1);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertEquals(2, clone.neighbors.size());
    }
}
