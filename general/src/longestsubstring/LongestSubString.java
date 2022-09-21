package longestsubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.youtube.com/watch?v=4i6-9IzQHwo
 *
 * T(n) = O(n)
 */
public class LongestSubString {

    public int lengthOfLongestSubStr(String input) {
        int i=0, j=0, max=0;
        Set<Character> inputSet = new HashSet<>();
        char[] inputChar = input.toCharArray();
        while (i < inputChar.length) {
            char current = inputChar[i];

            while (inputSet.contains(current)) {
                inputSet.remove(inputChar[j]);
                j++;
            }
            inputSet.add(current);
            max = Math.max(i - j +1, max);

            i++;
        }

        return max;
    }
}
