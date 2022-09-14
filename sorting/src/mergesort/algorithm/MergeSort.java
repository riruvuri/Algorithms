package mergesort.algorithm;

public class MergeSort {
    public int[] sort(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    public void mergeSort(int[] input, int start, int end) {
        // Leaf level cases
        if (start >= end) {
            return;
        }

        // Process arbitrary manager
        int mid = start + (end - start)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid+1, end);

        // Process to merge the sorted lists
        int i=start;
        int j=mid+1;
        int[] auxArray = new int[end - start + 1];
        int auxCounter = 0;
        while (i <= mid && j <= end) {
            int left = input[i];
            int right = input[j];

            if (left <= right) {
                auxArray[auxCounter++] = left;
                i++;
            } else {
                auxArray[auxCounter++] = right;
                j++;
            }
        }

        while(i <= mid) {
            auxArray[auxCounter++] = input[i++];
        }

        while(j <= end) {
            auxArray[auxCounter++] = input[j++];
        }

        // Commbine - copy the elements from aux array to input
        for (int m=0; m < auxArray.length; m++) {
            input[start] = auxArray[m];
            start++;
        }
    }
}