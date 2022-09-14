package selectionsort.algorithm;

public class SelectionSort {

    public int[] sort(int[] input) {
        for (int i=0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int red=i+1; red < input.length; red++) {
                if (input[red] < input[minIndex]) {
                    minIndex = red;
                }
            }
            // swap the element
            swap(input, i, minIndex);
        }
        return input;
    }

    public int[] selectionSort(int[] array) {
        for (int i=0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(array, i, minIndex);
            }
        }

        return array;
    }

    /*
    public int[] selectionSortMaxElement(int[] array) {
        for (int i=array.length - 1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                swap(array, i, maxIndex);
            }
        }

        return array;
    }*/


    private void swap(int[] array, int i, int minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }
}
