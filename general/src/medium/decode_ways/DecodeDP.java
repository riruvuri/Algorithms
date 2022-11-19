package medium.decode_ways;

/*
LC: 91 - Decode Ways
Time complexity: O(N)
Space complexity: O(N)
 */
public class DecodeDP {
    public int findWays(String input) {
        int[] dp = new int[input.length() + 1];
        dp[0] = 1;

        /*
         Total possibilities with the string of length '1' is based
         on the whether the digit is with in the range or not.
         */
        dp[1] = input.charAt(0) - '0' > 0 ? 1 : 0;

        for (int i=2; i <= input.length(); i++) {
            if (dp[i-1] > 0) {
                char c = input.charAt(i-1);
                /*
                 If there are 'x' possibilities of reaching dp[i-1], then the
                 same are valid if the current char is valid.
                 */
                if (c - '0' > 0) {
                    dp[i] += dp[i-1];
                }

                if (dp[i] > 0) {
                    String str = input.substring(i-2, i);
                    int twoDigit = Integer.valueOf(str);

                    if (twoDigit >= 0 && twoDigit <= 26) {
                        dp[i] += dp[i-2];
                    }

                }
            }
        }

        return dp[input.length()];
    }
}
