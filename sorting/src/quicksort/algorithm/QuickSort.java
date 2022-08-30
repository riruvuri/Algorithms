package quicksort.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuickSort {

    public int[] sort(int[] input) {
        sort(input, 0, input.length - 1);
        return input;
    }

    public void sort(int[] input, int start, int end) {
        // leaf node scenario
        if (start >= end) {
            return;
        }

        Random rand = new Random();
        int randIndex = rand.nextInt((end - start) + 1)+ start;
        swap(input, start, randIndex);

        //int partitionIndex = lomutoPartitionIndex(input, start, end);
        int partitionIndex = hoaresPartitionIndex(input, start, end);
        swap(input, start, partitionIndex);

        sort(input, start, partitionIndex - 1);
        sort(input, partitionIndex+1, end);
    }

    private int lomutoPartitionIndex(int[] input, int start, int end) {
        /*
            Scan through the whole array and move all the elements
            less than the pivot. Make use of a variable to keep the partition
            index.
         */
        int smaller = start;
        for (int bigger=start+1; bigger <= end; bigger++) {
            if (input[bigger] <= input[start]) {
                smaller++;
                swap(input, smaller, bigger);
            }
        }
        return smaller;
    }

    private int hoaresPartitionIndex(int[] input, int start, int end) {
        /*
            Scan through the whole array using two pointers.
         */
        int smaller = start + 1;
        int bigger = end;

        while (smaller <= bigger) {
            if (input[smaller] <= input[start]) {
                smaller++;
            } else if (input[bigger] > input[start]) {
                bigger--;
            } else {
                swap(input, smaller, bigger);
                smaller++;
                bigger--;
            }
        }

        return bigger;
    }

    private void swap(int[] input, int smaller, int bigger) {
        int temp = input[smaller];
        input[smaller] = input[bigger];
        input[bigger] = temp;
    }
}
