package medium.longest_string_chain;

import java.util.*;

/**
 * LC: 1048: Longest string chain
 *
 * Time complexity:
 * The parameters to consider here are:
 *  - Size of the input array
 *  - Length of each word in the array. This decides how many DFS calls, we need to make.
 *
 *  Find the time complexity of DFS:
 *      Let 'L' be the length of each word.
 *      O(L) for the StringBuilder creation and it is performed for 'L' number of times
 *
 *      DFS T(n) = O(L * L)
 *
 *  DFS is invoked for all the words in the input array: O( L^2 * N)
 *  O(N) is for copying the input array to set.
 *
 *  Overall complexity: O(N) + O( L^2 * N) => O( L^2 * N)
 *
 *  Space complexity: O(N) for the recursion call stack
 */
public class LongestStringChain {
    public int longestStrChain(String[] words) {
        Set<String> wordSet = new HashSet<>();
        Collections.addAll(wordSet, words);
        Map<String, Integer> memo = new HashMap<>();
        int longestChain = 0;

        for (String word : words) {
            longestChain = Math.max(longestChain, dfs(word, wordSet, memo));
        }

        return longestChain;
    }

    private int dfs(String word, Set<String> wordSet, Map<String, Integer> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }

        int maxLength = 1;
        StringBuilder sb = new StringBuilder(word);

        for (int i=0; i < sb.length(); i++) {
            sb.deleteCharAt(i);

            if (wordSet.contains(sb.toString())) {
                int currentLength = 1 + dfs(sb.toString(), wordSet, memo);
                maxLength = Math.max(maxLength, currentLength);
            }

            sb.insert(i, word.charAt(i));
        }

        memo.put(word, maxLength);

        return maxLength;

    }
}
