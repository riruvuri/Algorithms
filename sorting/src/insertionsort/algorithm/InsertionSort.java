package insertionsort.algorithm;

public class InsertionSort {

    public int[] sort(int[] input) {

        for (int i=0; i < input.length; i++) {
            int temp = input[i];
            int red = i - 1;
            while (red >= 0 && input[red] > temp) {
                input[red + 1] = input[red];
                red--;
            }
            input[red+1] = temp;
        }

        return input;
    }
}
