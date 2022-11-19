package arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ArrayHelper {

    /**
     * Convert array of primitive long to ArrayList of Long
     */
    public static ArrayList<Long> convertToList(long[] input) {
        ArrayList<Long> longList = new ArrayList<>(LongStream.of(input).boxed().collect(Collectors.toList()));
        return longList;
    }

    public static int[][] sort(int[][] input) {
        Arrays.sort(input, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        //Arrays.sort(input, (a, b) -> (a[0] - b[0]));
        return input;
    }

    public static int[][] sortMapOfInts(Map<Integer, Integer> inputMap) {
        List<int[]> outputList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : inputMap.entrySet()) {
            outputList.add(new int[]{entry.getKey(), entry.getValue()});
        }

        Collections.sort(outputList, (arr1, arr2)-> (arr1[0] - arr2[0]));
        return outputList.toArray(new int[][]{});

    }
}
