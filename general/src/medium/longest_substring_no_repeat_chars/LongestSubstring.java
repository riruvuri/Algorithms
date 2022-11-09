package medium.longest_substring_no_repeat_chars;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxLen = 0;
        Map<Character, Integer> charCountMap = new HashMap<>();
        while (r < s.length()) {
            char currentChar = s.charAt(r);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

            while (charCountMap.get(currentChar) > 1) {
                charCountMap.put(s.charAt(l), charCountMap.get(s.charAt(l)) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}
