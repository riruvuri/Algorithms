package medium.min_increment_to_array_unique;

import java.util.Arrays;

/**
 * LC: 945
 *
 * TC: O(n log n)
 */
public class UniqueArray {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int previous = nums[0];

        int minCount = 0;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] <= previous) {
                previous++;
                minCount += (previous - nums[i]);
            } else {
                previous = nums[i];
            }
        }

        return minCount;
    }
}
