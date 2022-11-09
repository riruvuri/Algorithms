package medium.maximum_ones;

/**
 * LC: 1004
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int l=0, r=0, max = 0;

        while (r < nums.length) {
            if (nums[r] == 1 || (nums[r] == 0 && k > 0)) {
                if (nums[r] == 0) {
                    k--;
                }
                r++;
            } else {
                while (k == 0) {
                    if (nums[l] == 0) {
                        k++;
                    }
                    l++;
                }
            }


            max = Math.max(max, r - l);
        }

        return max;
    }
}
