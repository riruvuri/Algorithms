package medium.longest_substring_k_distinct_chars;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * LC: 340
 *
 * https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/solutions/241506/longest-substring-with-at-most-k-distinct-characters/
 */
public class LongestSubstring {
    public int longestSubstringWithKCharacters(String s, int k) {
        int l=0, r=0, maxLen=0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        while (r < s.length()) {
            charIndexMap.put(s.charAt(r), r);
            if (charIndexMap.size() == k+1) {
                int minIndex = Collections.min(charIndexMap.values());
                charIndexMap.remove(s.charAt(minIndex));
                l = minIndex + 1;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
