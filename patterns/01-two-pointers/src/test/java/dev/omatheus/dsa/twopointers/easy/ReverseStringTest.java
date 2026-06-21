package dev.omatheus.dsa.twopointers.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

    private final ReverseString solution = new ReverseString();

    @Test
    void basicThreeChars() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }

    @Test
    void singleChar() {
        char[] s = {'a'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'a'}, s);
    }

    @Test
    void twoChars() {
        char[] s = {'a', 'b'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'b', 'a'}, s);
    }

    @Test
    void evenLength() {
        char[] s = {'a', 'b', 'c', 'd'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'d', 'c', 'b', 'a'}, s);
    }

    @Test
    void oddLength() {
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'e', 'd', 'c', 'b', 'a'}, s);
    }

    @Test
    void allSameChars() {
        char[] s = {'a', 'a', 'a', 'a'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'a', 'a', 'a', 'a'}, s);
    }

    @Test
    void withSpaces() {
        char[] s = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'d', 'l', 'r', 'o', 'w', ' ', 'o', 'l', 'l', 'e', 'h'}, s);
    }
}
