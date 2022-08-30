package countingsort.algorithm;

public class CountingSort {
    public int[] sort(int[] input) {
        // Without using any comparisons we need to implement a mechanism to sort the input
        // Input can contain positive and negative elements

        // Scan through the array to find the boundaries
        int min = input[0];
        int max = input[0];

        for (int i=1; i < input.length;i++) {
            if (input[i] < min) {
                min = input[i];
            } else if (input[i] > max) {
                max=input[i];
            }
        }

        // create a new count array based on the above max and min values
        int[] countArray = new int[max-min+1];
        for (int i=0; i < input.length;i++) {
            int elementVal = input[i];
            countArray[elementVal-min]++;
        }

        int[] output = new int[input.length];
        int j=0;
        for (int i=0; i < countArray.length; i++) {
            int counter = countArray[i];
            while (counter > 0) {
                output[j++]= (i+min);
                counter--;
            }
        }
        return output;
    }
}
