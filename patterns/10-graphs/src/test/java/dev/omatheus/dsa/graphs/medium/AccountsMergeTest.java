package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AccountsMergeTest {

    private final AccountsMerge solution = new AccountsMerge();

    @Test
    void basicMerge() {
        List<List<String>> accounts = List.of(
                List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                List.of("John", "johnsmith@mail.com", "john00@mail.com"),
                List.of("Mary", "mary@mail.com"),
                List.of("John", "johnnybravo@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(3, result.size());
    }

    @Test
    void noOverlap() {
        List<List<String>> accounts = List.of(
                List.of("John", "john@mail.com"),
                List.of("Mary", "mary@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(2, result.size());
    }

    @Test
    void completeOverlap() {
        List<List<String>> accounts = List.of(
                List.of("John", "a@mail.com", "b@mail.com"),
                List.of("John", "a@mail.com", "b@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
    }

    @Test
    void partialOverlap() {
        List<List<String>> accounts = List.of(
                List.of("John", "a@mail.com", "b@mail.com"),
                List.of("John", "b@mail.com", "c@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
    }

    @Test
    void singleAccount() {
        List<List<String>> accounts = List.of(
                List.of("John", "a@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
        assertEquals(2, result.get(0).size());
    }

    @Test
    void complexMerges() {
        List<List<String>> accounts = List.of(
                List.of("A", "a1@mail.com", "a2@mail.com"),
                List.of("B", "b1@mail.com", "b2@mail.com"),
                List.of("A", "a2@mail.com", "a3@mail.com"),
                List.of("B", "b2@mail.com", "b3@mail.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(2, result.size());
    }
}
