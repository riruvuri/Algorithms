package easy.two_sum_less_k;

import java.util.Arrays;

/**
 * LC: 1099
 *
 * Time complexity: O(n log n)
 * Space complexity: O(log n) to O(n) based on sorting algorithm
 */
public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);

        int l=0, r=nums.length-1;
        int max = -1;

        while (l < r) {
            int sum = nums[l] + nums[r];

            if (sum < k) {
                max = Math.max(sum, max);
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
