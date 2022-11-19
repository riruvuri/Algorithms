package medium.decode_ways;

import java.util.Arrays;

/*
LC: 91 - Decode Ways
 */
public class DecodeMemoization {
    public int findWays(String input) {
        int[] memo = new int[input.length() + 1];
        Arrays.fill(memo, -1);
        return decodeHelper(input, memo);
    }

    private int decodeHelper(String input, int[] memo) {
        if (0 == input.length()) {
            return 1;
        }

        if (memo[input.length()] != -1) {
            return memo[input.length()];
        }

        int first = input.charAt(0) - '0';
        int decodePossibilities = 0;
        if (first > 0) {
            decodePossibilities += decodeHelper(input.substring(1), memo);
        }

        if (input.length() > 1 && decodePossibilities > 0) {
            // Find if the two digits are valid
            int second = input.charAt(1) - '0';
            int twoDigit = first * 10 + second;
            if (twoDigit <= 26) {
                decodePossibilities += decodeHelper(input.substring(2), memo);
            }
        }

        memo[input.length()] = decodePossibilities;

        return decodePossibilities;
    }
}
