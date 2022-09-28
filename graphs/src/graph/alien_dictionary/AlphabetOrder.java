package graph.alien_dictionary;

import java.io.CharConversionException;
import java.util.*;

/**
 * Find order of characters in an alien dictionary
 *
 * {
 * "words": ["baa", "abcd", "abca", "cab", "cad"]
 * }
 *
 * Output: "bdac"
 *
 * TC: O(total no. of characters)
 * SC: O(total no. of characters)
 */
public class AlphabetOrder {

    public String findOrder(String[] words) {
        // Build a graph
        Map<Character, List<Character>> map = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();

        // Go through all the words to find the unique characters
        for (String word : words) {
            for (char c : word.toCharArray()) {
                map.putIfAbsent(c, new ArrayList<>());
                indegree.putIfAbsent(c, 0);
            }
        }

        /*
         To find the character sequence match each word with the subsequent one until the first difference is found
         For ex: "cab" vs "cad" => first character difference of b and d indicates b is before d
         */

        for (int i=0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i+1];
            int len = Math.min(word1.length(), word2.length());

            for (int k=0; k < len; k++) {
                if (word1.charAt(k) != word2.charAt(k)) {
                    map.get(word1.charAt(k)).add(word2.charAt(k));
                    indegree.put(word2.charAt(k), indegree.get(word2.charAt(k)) + 1);
                    break;
                }
            }
        }

        return bfs(map, indegree);
    }

    private String bfs(Map<Character, List<Character>> map, Map<Character, Integer> indegree) {
        Queue<Character> queue = new LinkedList<>();
        Set<Character> uniqueChars = map.keySet();
        for (Character uniqueChar : uniqueChars) {
            if (indegree.get(uniqueChar) == 0) {
                queue.offer(uniqueChar);
                break;
            }
        }

        StringBuffer sb = new StringBuffer();
        while (!queue.isEmpty()) {
            Character ch = queue.poll();
            sb.append(ch);

            List<Character> neighbors = map.get(ch);
            for (Character neighbor : neighbors) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);

                if (indegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return sb.toString();
    }
}
