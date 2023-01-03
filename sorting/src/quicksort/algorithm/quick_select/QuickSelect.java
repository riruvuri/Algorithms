package quicksort.algorithm.quick_select;

import java.util.Random;

public class QuickSelect {
    public int findKthLargest(int [] input, int k) {
        return helper(input, 0, input.length - 1, input.length - k);
    }

    private int helper(int[] input, int start, int end, int k) {
        if (start == end) {
            return input[start];
        }

        int pivot = new Random().nextInt(end - start + 1) + start;
        swap(input, start, pivot);

        // Partition logic
        int smaller = start;
        for (int bigger=smaller+1; bigger <= end; bigger++) {
            if (input[bigger] < input[start]) {
                smaller++;
                swap(input, bigger, smaller);
            }
        }
        swap(input, start, smaller);

        if (smaller == k) {
            return input[smaller];
        } else if (smaller > k) {
            return helper(input, start, smaller - 1, k);
        } else {
            return helper(input, smaller + 1, end, k);
        }
    }

    private void swap(int[] input, int smaller, int bigger) {
        int temp = input[smaller];
        input[smaller] = input[bigger];
        input[bigger] = temp;
    }
}
