package medium18.sorted_rotated_array;

public class SortedRotatedSearch {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r-l)/2;
            int midElement = nums[mid];

            if (midElement == target) {
                return mid;
            } else if (nums[l] <= nums[mid]) {
                // left array is sorted

                // check where the target element is
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        return -1;
    }

}
