package hard.pizza_cutting;

import java.util.HashMap;
import java.util.Map;

/**
 * LC: 1444. Number of Ways of Cutting a Pizza
 *
 * https://leetcode.com/problems/number-of-ways-of-cutting-a-pizza/solutions/884460/java-dfs-memorization-easy-to-understand-with-explanation/
 *
 */
public class PizzaCuts {
    public int ways(String[] pizza, int k) {
        if (pizza == null || pizza.length == 0) {
            return 0;
        }

        Map<String, Long> memo = new HashMap<>();
        int tmp = (int)1e9 + 7;

        int result = (int)(dfs(pizza, memo, k, 0, pizza.length - 1, 0, pizza[0].length() - 1) % tmp);
        return result;
    }

    private long dfs(String[] pizza, Map<String, Long> memo, int k, int rowStart, int rowEnd, int colStart, int colEnd) {
        if (k == 0 || rowStart > rowEnd || colStart > colEnd) {
            return 0;
        }

        String key = rowStart + ":" + rowEnd + ";" + colStart + ":" + colEnd + ";" + k;
        if(memo.containsKey(key)) {
            return memo.get(key);
        }

        long totalPossibilities = 0;

        if (k == 1) {
            totalPossibilities = isValidCut(pizza, rowStart, rowEnd, colStart, colEnd) ? 1 : 0;
            memo.put(key, totalPossibilities);
            return totalPossibilities;
        }

        for (int i=rowStart; i <= rowEnd; i++) {
            if (isValidCut(pizza, rowStart, i, colStart, colEnd)) {

                totalPossibilities += dfs(pizza, memo, k - 1, i + 1, rowEnd, colStart, colEnd);
            }
        }

        for (int j=colStart; j <= colEnd; j++) {
            if (isValidCut(pizza, rowStart, rowEnd, colStart, j)) {
                totalPossibilities += dfs(pizza, memo,k -1, rowStart, rowEnd, j + 1, colEnd);
            }
        }

        memo.put(key, totalPossibilities);

        return totalPossibilities;
    }

    private boolean isValidCut(String[] pizza, int rowStart, int rowEnd, int colStart, int colEnd) {
        for (int i=rowStart; i <= rowEnd; i++) {
            for (int j=colStart; j <= colEnd; j++) {
                if (pizza[i].charAt(j) == 'A') {
                    return true;
                }
            }
        }
        return false;
    }
}
