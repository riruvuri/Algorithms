package heapsort.algorithm;

import java.util.Arrays;

public class HeapSort {

    public int[] sort(int[] input) {
        // Order the input elements to follow the priority queue
        for (int i=(input.length - 1)/2;i>=0;i--) {
            heapify(input, i, input.length - 1);
        }

        int length = input.length - 1;
        for (int i=length; i>=0; i--) {
            swap(input, 0, i);

            length = length - 1;
            heapify(input, 0, length);
        }

        return input;
    }

    /*
        Check if the element at index 'i' follow the heap properties
     */
    private void heapify(int[] input, int index, int boundary) {

        int leftIndex = 2 * index + 1;
        int rightIndex = leftIndex + 1;
        int biggerIndex = index;

        if (leftIndex <= boundary && input[leftIndex] > input[biggerIndex]) {
            biggerIndex = leftIndex;
        }

        if (rightIndex <= boundary && input[rightIndex] > input[biggerIndex]) {
            biggerIndex = rightIndex;
        }

        if (index != biggerIndex) {
            swap(input, index, biggerIndex);
            heapify(input, biggerIndex, boundary);
        }
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
