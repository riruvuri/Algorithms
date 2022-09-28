package general;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumCoins {

    static Integer minimum_coins(ArrayList<Integer> coins, Integer value) {
        int[] table = new int[value +1];
        Arrays.fill(table, Integer.MAX_VALUE);
        table[0] = 0;


        for (int i=1; i < table.length; i++) {
            for (int coin : coins) {
                if (i-coin >= 0) {
                    table[i] = Math.min(table[i], table[i-coin]);
                }
            }
            table[i]++;
        }
        return table[value];
    }

}
