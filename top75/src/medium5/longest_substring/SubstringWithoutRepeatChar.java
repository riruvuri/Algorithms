package medium5.longest_substring;

import java.util.HashSet;
import java.util.Set;

public class SubstringWithoutRepeatChar {
    public int longestSubstr(String inputStr) {
        int i=0, j=0, max=0;
        int length = inputStr.length();
        Set<Character> inputChars = new HashSet<>();

        while (j < length) {
            while(inputChars.contains(inputStr.charAt(j))) {
                i++;
                inputChars.remove(inputStr.charAt(j));
            }

            inputChars.add(inputStr.charAt(j));

            max = Math.max(j-i+1, max);

            j++;
        }

        return max;
    }
}
