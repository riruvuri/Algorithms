package bubblesort.algorithm;

public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i=0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j-1] > array[j]) {
                    swap(j, j-1, array);
                }
            }
        }
        return array;
    }

    public int[] sortForward(int[] array) {
        for (int i=0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    swap(j, j+1, array);
                }
            }
        }
        return array;
    }

    public int[] sortImproved(int[] array) {
        boolean sorted;
        do {
            sorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    swap(j, j+1, array);
                    sorted = false;
                }
            }
        } while(!sorted);

        return array;
    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
