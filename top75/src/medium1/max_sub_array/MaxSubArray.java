package medium1.max_sub_array;

public class MaxSubArray {
    public int maxSubArray(int[] input) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i=0; i < input.length; i++) {
            curSum = curSum + input[i];
            curSum = Math.max(curSum, input[i]);
            max = Math.max(max, curSum);
        }

        return max;
    }
}
