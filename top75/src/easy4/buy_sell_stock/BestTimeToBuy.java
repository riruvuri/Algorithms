package easy4.buy_sell_stock;

public class BestTimeToBuy {
    public int maxProfit(int[] input) {
        // Buy at low and sell at high
        if (input == null || input.length == 0) {
            return 0;
        }
        int min = input[0];
        int maxProfit = 0;
        for (int i=1; i < input.length; i++) {
            maxProfit = Math.max(maxProfit, input[i] - min);
            min = Math.min(min, input[i]);
        }

        return maxProfit;
    }
}
