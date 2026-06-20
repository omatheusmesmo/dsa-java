package dev.omatheus.dsa.unionfind.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class AccountsMergeTest {

    private final AccountsMerge solution = new AccountsMerge();

    @Test
    void basicMerge() {
        List<List<String>> accounts = List.of(
            List.of("John", "john@a.com", "john_b.com"),
            List.of("John", "john@a.com"),
            List.of("Mary", "mary@a.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(2, result.size());
    }

    @Test
    void noOverlap() {
        List<List<String>> accounts = List.of(
            List.of("John", "john@a.com"),
            List.of("Mary", "mary@a.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(2, result.size());
    }

    @Test
    void completeOverlap() {
        List<List<String>> accounts = List.of(
            List.of("John", "john@a.com", "john_b.com"),
            List.of("John", "john@a.com", "john_c.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
    }

    @Test
    void partialOverlap() {
        List<List<String>> accounts = List.of(
            List.of("John", "john@a.com", "john_b.com"),
            List.of("John", "john_b.com", "john_c.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
    }

    @Test
    void singleAccount() {
        List<List<String>> accounts = List.of(
            List.of("John", "john@a.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(1, result.size());
    }

    @Test
    void complexMerges() {
        List<List<String>> accounts = List.of(
            List.of("Alex", "alex@m.com"),
            List.of("Alex", "alex@m.com", "alex@w.com"),
            List.of("Bob", "bob@m.com")
        );
        List<List<String>> result = solution.accountsMerge(accounts);
        assertEquals(2, result.size());
    }
}
