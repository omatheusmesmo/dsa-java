package dev.omatheus.dsa.stacks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {

    private final SimplifyPath solution = new SimplifyPath();

    @Test
    void basicPath() {
        assertEquals("/home", solution.simplifyPath("/home/"));
    }

    @Test
    void nestedDirs() {
        assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
    }

    @Test
    void parentDir() {
        assertEquals("/", solution.simplifyPath("/../"));
    }

    @Test
    void currentDir() {
        assertEquals("/home", solution.simplifyPath("/home/./"));
    }

    @Test
    void multipleSlashes() {
        assertEquals("/a", solution.simplifyPath("///a///"));
    }

    @Test
    void noSlash() {
        assertEquals("/a", solution.simplifyPath("/a"));
    }

    @Test
    void complexPath() {
        assertEquals("/home/user/Documents", solution.simplifyPath("/home/user/Documents/"));
    }

    @Test
    void singleDir() {
        assertEquals("/a", solution.simplifyPath("/a/b/../"));
    }
}
