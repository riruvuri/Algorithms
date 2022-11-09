package medium.longest_string_chain;

import java.util.*;

/**
 * Note: Look at the DFS approach before going with the DP
 *
 * T(n) = O(N log N + L ^2 N)
 *
 * S(n) = O(N)
 */
public class LongestStringChainDP {
    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> dp = new HashMap<>();
        int longestChain = 0;

        for (String word : words) {
            int presentLength = 1;
            for (int i=0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                int prevLength = dp.getOrDefault(sb.toString(), 0);

                presentLength = Math.max(presentLength, prevLength + 1);
            }
            dp.put(word, presentLength);

            longestChain = Math.max(longestChain, presentLength);
        }

        return longestChain;
    }
}
