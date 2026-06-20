package dev.omatheus.dsa.graphs.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class WordLadderTest {

    private final WordLadder solution = new WordLadder();

    @Test
    void basicCase() {
        assertEquals(5, solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void noPath() {
        assertEquals(0, solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }

    @Test
    void singleStep() {
        assertEquals(2, solution.ladderLength("hit", "hot", List.of("hot")));
    }

    @Test
    void longPath() {
        assertEquals(5, solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void noEndWord() {
        assertEquals(0, solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog")));
    }

    @Test
    void directTransformation() {
        assertEquals(2, solution.ladderLength("abc", "def", List.of("abc", "def")));
    }
}
