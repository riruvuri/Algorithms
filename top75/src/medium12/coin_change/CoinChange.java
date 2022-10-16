package medium12.coin_change;

public class CoinChange {
    public int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for (int i=1; i <= amount; i++) {
            int minCoins = Integer.MAX_VALUE;
            for (int c=0; c < coins.length; c++) {
                int coinCount = 0;
                if (i - coins[c] >= 0) {
                    coinCount = 1 + dp[i - coins[c]];
                    minCoins = Math.min(coinCount, minCoins);
                }
            }
            dp[i] = minCoins;
        }

        return dp[amount];
    }
}
