package max_profit;

public class CuttingRodRecursion {
    public int maxProfit(int n, int[] profit) {
        if (n == 0) {
            return profit[0];
        }

        int maxProfit = 0;
        for (int i=1; i <= n; i++) {
            int currentProfit = profit[i] + maxProfit(n-i, profit);
            maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
    }
}
