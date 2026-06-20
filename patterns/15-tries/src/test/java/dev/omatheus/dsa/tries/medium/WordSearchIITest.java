package dev.omatheus.dsa.tries.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class WordSearchIITest {

    private final WordSearchII solution = new WordSearchII();

    @Test
    void basicFound() {
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        List<String> result = solution.findWords(board, new String[]{"oath", "pea", "eat", "rain"});
        assertTrue(result.contains("oath"));
        assertTrue(result.contains("eat"));
        assertEquals(2, result.size());
    }

    @Test
    void noWords() {
        char[][] board = {{'a'}};
        List<String> result = solution.findWords(board, new String[]{"b"});
        assertTrue(result.isEmpty());
    }

    @Test
    void singleCell() {
        char[][] board = {{'a'}};
        List<String> result = solution.findWords(board, new String[]{"a"});
        assertTrue(result.contains("a"));
    }

    @Test
    void complexBoard() {
        char[][] board = {
            {'a', 'b', 'c', 'd'},
            {'e', 'f', 'g', 'h'},
            {'i', 'j', 'k', 'l'}
        };
        List<String> result = solution.findWords(board, new String[]{"abcdefghijkl"});
        assertTrue(result.contains("abcdefghijkl"));
    }

    @Test
    void overlappingWords() {
        char[][] board = {
            {'a', 'b'},
            {'c', 'd'}
        };
        List<String> result = solution.findWords(board, new String[]{"ab", "abc", "abcd"});
        assertTrue(result.contains("ab"));
    }

    @Test
    void allDirections() {
        char[][] board = {
            {'a', 'b'},
            {'b', 'a'}
        };
        List<String> result = solution.findWords(board, new String[]{"aba"});
        assertEquals(1, result.size());
    }
}
