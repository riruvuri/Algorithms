package application.kth_largest_stream;

/**
 * Given an initial list along with another list of numbers to be appended with the initial list
 * and an integer k, return an array consisting of the k-th largest element after adding each element
 * from the first list to the second list.
 *
 * {
 * "k": 2,
 * "initial_stream": [4, 6],
 * "append_stream": [5, 2, 20]
 * }
 *
 * Output: [5, 5, 6]
 */

import java.util.*;

public class KthLargestInStreamHeapSort {
    public List<Integer> findKthLargest(Integer k, List<Integer> initialStream, List<Integer> appendStream) {

        List<Integer> sortedList = new ArrayList<>();

        for (Integer appendInt : appendStream) {
            initialStream.add(appendInt);

            for (int i=(initialStream.size() - 1)/2; i >=0; i--) {
                heapify(initialStream, i, initialStream.size() - 1);
            }

            int length = initialStream.size() -1;
            int ctr = k;
            for (int i=length; i >= 0 && ctr > 0; i--, ctr--) {
                // Swap the element at the 0 index with length
                swap(initialStream, 0, i);
                length = length - 1;
                heapify(initialStream, 0, length);
            }

            sortedList.add(initialStream.get(initialStream.size() - k));

        }

        return sortedList;
    }

    private void heapify(List<Integer> initialStream, int currentIndex, int boundary) {
        int leftIndex = 2 * currentIndex + 1;
        int rightIndex = leftIndex + 1;
        int biggerIndex = currentIndex;

        if (leftIndex <= boundary && initialStream.get(leftIndex) > initialStream.get(biggerIndex)) {
            biggerIndex = leftIndex;
        }

        if (rightIndex <= boundary && initialStream.get(rightIndex) > initialStream.get(biggerIndex)) {
            biggerIndex = rightIndex;
        }

        if (currentIndex != biggerIndex) {
            //swap the elements
            swap(initialStream, currentIndex, biggerIndex);
            heapify(initialStream, biggerIndex, boundary);
        }
    }

    private void swap(List<Integer> initialStream, int currentIndex, int newIndex) {
        //swap the elements
        int temp = initialStream.get(currentIndex);
        initialStream.set(currentIndex, initialStream.get(newIndex));
        initialStream.set(newIndex, temp);
    }
}
