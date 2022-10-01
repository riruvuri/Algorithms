package max_profit;

public class CuttingRodDP {
    public int maxProfit(int n, int[] profit) {
        int[] table = new int[n+1];
        table[0] = 0;
        for (int i=1; i <= n; i++) {
            for (int c=1; c < i+1; c++) {
                int currentProfit = profit[c] + table[i-c];
                table[i] = Math.max(currentProfit, table[i]);
            }
        }

        return table[n];
    }
}
