package radixsort.algorithm;

public class RadixSort {

    public int[] sort(int[] input) {
        // Find the max element
        int max = input[0];
        for (int i=0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }

        for (int div=1; (max / div) > 0; div*=10) {
            countSort(input, div);
        }

        return input;
    }

    private void countSort(int[] input, int div) {
        int[] countArray = new int[10];
        int[] outputArray = new int[input.length];

        // Take the LSD and update the counter array
        for (int i=0; i < input.length; i++) {
            int lsd = (input[i]/div) % 10;
            countArray[lsd]++;
        }

        for (int i=1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }

        for (int i=input.length - 1; i >= 0; i--) {
        //for (int i=0; i < input.length; i++) {
            int lsd = (input[i]/div) % 10;
            outputArray[countArray[lsd] - 1] = input[i];
            countArray[lsd]--;
        }

        for (int i=0; i < outputArray.length; i++) {
            input[i] = outputArray[i];
        }
    }
}
