package dev.omatheus.dsa.tries.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignAddAndSearchWordsTest {

    @Test
    void basicAddSearch() {
        DesignAddAndSearchWords dict = new DesignAddAndSearchWords();
        dict.addWord("bad");
        dict.addWord("dad");
        dict.addWord("mad");
        assertTrue(dict.search("bad"));
        assertFalse(dict.search("pad"));
    }

    @Test
    void wildcardSearch() {
        DesignAddAndSearchWords dict = new DesignAddAndSearchWords();
        dict.addWord("bad");
        assertTrue(dict.search("b.d"));
        assertTrue(dict.search("ba."));
    }

    @Test
    void noMatch() {
        DesignAddAndSearchWords dict = new DesignAddAndSearchWords();
        dict.addWord("bad");
        assertFalse(dict.search("cat"));
    }

    @Test
    void partialMatch() {
        DesignAddAndSearchWords dict = new DesignAddAndSearchWords();
        dict.addWord("bad");
        assertTrue(dict.search("b.."));
        assertFalse(dict.search("b...."));
    }

    @Test
    void singleChar() {
        DesignAddAndSearchWords dict = new DesignAddAndSearchWords();
        dict.addWord("a");
        assertTrue(dict.search("a"));
        assertFalse(dict.search("b"));
        assertTrue(dict.search("."));
    }

    @Test
    void complexWildcards() {
        DesignAddAndSearchWords dict = new DesignAddAndSearchWords();
        dict.addWord("at");
        dict.addWord("and");
        dict.addWord("an");
        assertTrue(dict.search("a."));
        assertFalse(dict.search("a"));
        assertTrue(dict.search("an."));
        assertFalse(dict.search("an"));
    }
}
