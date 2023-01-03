package application.twowaypartition;

public class TwoWayPartition {
    // [1,2,3,4] to [2,4,1,3]
    public int[] partition(int[] input) {
        int partitionCtr = 0;
        for (int i=0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                swap(i, partitionCtr, input);
                partitionCtr++;
            }
        }
        return input;
    }

    private void swap(int i, int j, int[] input) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}