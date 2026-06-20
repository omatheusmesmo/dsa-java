package dev.omatheus.dsa.graphs.hard;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/word-ladder/">127. Word Ladder</a> (Hard)
 *
 * <p>A transformation sequence from word beginWord to word endWord is a sequence of words
 * beginWord -> s1 -> s2 -> ... -> sk such that every adjacent pair of words differs by a
 * single letter, every si for 1 <= i <= k is in the wordList, and beginWord != sk. Given
 * beginWord, endWord, and a wordList, return the number of words in the shortest transformation
 * sequence, or 0 if no such sequence exists.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 * Explanation: One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog" (5 words).
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= beginWord.length <= 10</li>
 *   <li>endWord.length == beginWord.length</li>
 *   <li>1 <= wordList.length <= 5000</li>
 *   <li>wordList[i].length == beginWord.length</li>
 * </ul>
 *
 * @see WordLadderTest
 */
public class WordLadder {

    /**
     * Returns the length of the shortest transformation sequence.
     *
     * @param beginWord the starting word
     * @param endWord the target word
     * @param wordList the list of valid words
     * @return the length of the sequence, or 0 if not possible
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
