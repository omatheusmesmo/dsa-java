package dev.omatheus.dsa.tries.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ContactsHackerRankTest {

    private final ContactsHackerRank solution = new ContactsHackerRank();

    @Test
    void basicAddFind() {
        List<Integer> result = solution.solve(List.of("add hack", "add hackerrank", "find hac", "find hak"));
        assertEquals(List.of(2, 0), result);
    }

    @Test
    void multipleAdds() {
        List<Integer> result = solution.solve(List.of("add s", "add ss", "add sss", "find s", "find ss"));
        assertEquals(List.of(3, 2), result);
    }

    @Test
    void noMatch() {
        List<Integer> result = solution.solve(List.of("add hello", "find world"));
        assertEquals(List.of(0), result);
    }

    @Test
    void singleChar() {
        List<Integer> result = solution.solve(List.of("add a", "add b", "add c", "find a"));
        assertEquals(List.of(1), result);
    }

    @Test
    void largeInput() {
        List<String> ops = new java.util.ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            ops.add("add word" + i);
        }
        ops.add("find word");
        List<Integer> result = solution.solve(ops);
        assertEquals(List.of(1000), result);
    }

    @Test
    void complexOperations() {
        List<Integer> result = solution.solve(List.of("add code", "add coder", "add coding", "find code", "find cod"));
        assertEquals(List.of(3, 3), result);
    }
}
