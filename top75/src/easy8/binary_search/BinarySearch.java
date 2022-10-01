package easy8.binary_search;

public class BinarySearch {
    public int search(int[] input, int target) {
        if (input == null || input.length == 0) {
            return -1;
        }

        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (input[mid] == target) {
                return mid;
            } else if (input[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
