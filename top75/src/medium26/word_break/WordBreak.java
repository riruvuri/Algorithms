package medium26.word_break;

import java.util.List;

/**
 * Ref: https://www.youtube.com/watch?v=iWenZCZEBIA
 * https://www.youtube.com/watch?v=Sx9NNgInc3A
 *
 * T(n) = O(n * m * n)
 * n- length of input string
 * m - lenght of word in dictionary
 * comparison of contains will match every character.
 */
public class WordBreak {
    public boolean hasWordBreaks(String input, List<String> dictionary) {
        int n = input.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        /*
         * Improvement - 1
         * Find the max length of word and apply
         * the check
         */
        int maxLength = 0;
        for (String word : dictionary) {
            maxLength = Math.max(word.length(), maxLength);
        }

        for (int i=0; i <= n; i++) {
            for (int j=0; j < i; j++) {
                if (i - j > maxLength) {
                    continue;
                }
                if (dp[j] && dictionary.contains(input.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
