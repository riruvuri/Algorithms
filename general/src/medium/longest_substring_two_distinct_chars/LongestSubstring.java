package medium.longest_substring_two_distinct_chars;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class LongestSubstring {
    public int longestSubstringWithTwoDistinct(String s) {
        int l = 0, r=0, maxLen = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        while (r < s.length()) {
            charIndexMap.put(s.charAt(r), r);

            // When the map size exceeds the distinct character length, remove
            // the old index
            if (charIndexMap.size() == 3) {
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
