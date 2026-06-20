package dev.omatheus.dsa.hashing.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    private final GroupAnagrams solution = new GroupAnagrams();

    @Test
    void basicGrouping() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals(3, result.size());
    }

    @Test
    void singleElement() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"a"});
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
    }

    @Test
    void allAnagrams() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"abc", "bca", "cab"});
        assertEquals(1, result.size());
        assertEquals(3, result.get(0).size());
    }

    @Test
    void noAnagrams() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"a", "b", "c"});
        assertEquals(3, result.size());
    }

    @Test
    void emptyStrings() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"", ""});
        assertEquals(1, result.size());
        assertEquals(2, result.get(0).size());
    }

    @Test
    void singleChar() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"a", "a", "b"});
        assertEquals(2, result.size());
    }

    @Test
    void mixedLengths() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"ab", "ba", "abc"});
        assertEquals(2, result.size());
    }
}
