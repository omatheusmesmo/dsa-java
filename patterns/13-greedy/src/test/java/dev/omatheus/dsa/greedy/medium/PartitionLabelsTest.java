package dev.omatheus.dsa.greedy.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class PartitionLabelsTest {

    private final PartitionLabels solution = new PartitionLabels();

    @Test
    void basicCase() {
        assertEquals(List.of(9, 7, 8), solution.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    void singleChar() {
        assertEquals(List.of(1), solution.partitionLabels("a"));
    }

    @Test
    void allSame() {
        assertEquals(List.of(7), solution.partitionLabels("aaaaaaa"));
    }

    @Test
    void complexString() {
        assertEquals(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                solution.partitionLabels("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void fullAlphabet() {
        List<Integer> result = solution.partitionLabels("abcde");
        assertEquals(5, result.size());
    }
}
