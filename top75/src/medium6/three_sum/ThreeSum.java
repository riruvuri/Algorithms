package medium6.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public int[][] calculateSum(int[] input) {
        Arrays.sort(input);

        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i < input.length; i++) {
            if (i == 0 || input[i-1] != input[i]) {
                findSum(i, input, result);
            }
        }

        int[][] resultArr = new int[result.size()][];
        int i=0;
        for (List<Integer> pair : result) {
            resultArr[i++] = new int[]{pair.get(0), pair.get(1), pair.get(2)};
        }
        return resultArr;
    }

    private void findSum(int i, int[] input, List<List<Integer>> result) {
        int lo = i + 1;
        int hi = input.length - 1;

        while (lo < hi) {
            int sum = input[i] + input[lo] + input[hi];
            if (sum < 0) {
                lo++;
            } else if (sum > 0) {
                hi--;
            } else {
                result.add(Arrays.asList(input[i], input[lo++], input[hi--]));

                while (lo < hi && input[lo] == input[lo-1]) {
                    lo++;
                }
            }
        }
    }
}
