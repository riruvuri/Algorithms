package countingsort.algorithm;

public class CountingSortCumulativeCount {

    /*
    Explanation: https://www.youtube.com/watch?v=Rl2Ok_H-Qms
     */
    public int[] sort(int[] input) {

        int[] countArray = new int[10];
        for (int i=0; i < input.length; i++) {
            countArray[input[i]]++;
        }

        for (int i=1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }

        int[] output = new int[input.length];
        for (int i=0; i < input.length; i++) {
            output[--countArray[input[i]]] = input[i];
        }

        return output;
    }
}
