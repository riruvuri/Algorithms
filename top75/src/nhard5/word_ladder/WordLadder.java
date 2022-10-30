package nhard5.word_ladder;

import java.util.*;

/**
 * Ref: https://www.youtube.com/watch?v=5iFZP-f40iI
 * T(n) = O(M ^ 2 * N)
 * M - size of dequeued word
 * N - size of word list
 */
public class WordLadder {
    public int ladderLength (String beginWord, String endWord,
                                List<String> wordList) {
        Set<String> dictionarySet = new HashSet<>(wordList);
        if (!dictionarySet.contains(endWord)) {
            return 0;
        }

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                String word = queue.poll();

                if (word.equals(endWord)) {
                    return count;
                }

                for (int j=0; j < word.length(); j++) {
                    for (int k='a'; k <= 'z';k++) {
                        char[] wordArr = word.toCharArray();
                        wordArr[j] = (char)k;

                        String updatedWord = new String(wordArr);
                        if (dictionarySet.contains(updatedWord)
                                && !visited.contains(updatedWord)) {
                            queue.add(updatedWord);
                            visited.add(updatedWord);
                        }
                    }
                }
            }
            ++count;
        }

        return count;
    }
}
