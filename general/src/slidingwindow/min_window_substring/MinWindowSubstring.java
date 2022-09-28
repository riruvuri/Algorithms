package slidingwindow.min_window_substring;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=U1q16AFcjKs
 *
 * T(n) = O(2* N + M) => O(N+M)
 * S(n) = O(N)
 */
public class MinWindowSubstring {
    public String minWindow(String inputStr, String findStr) {
        if (inputStr == null || findStr == null || inputStr.isEmpty() || findStr.isEmpty()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for (Character c : findStr.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i=0, j=0, count = map.size();
        int left = 0, right = inputStr.length() - 1, min = inputStr.length();
        boolean found = false;

        // Sliding window
        while (j < inputStr.length()) {
            char endChar = inputStr.charAt(j++);

            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);

                if (map.get(endChar) == 0) {
                    count--;
                }
            }

            if (count > 0) {
                continue;
            }

            // This step is to eliminate extra characters
            while (count == 0) {
                char startChar = inputStr.charAt(i++);

                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);

                    if (map.get(startChar) > 0) {
                        count++;
                    }
                }
            }

            if (j-i < min) {
                left = i;
                right = j;
                min = j-i;

                found = true;
            }
        }
        return !found ? "" : inputStr.substring(left - 1, right);
    }

}
