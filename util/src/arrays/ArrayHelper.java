package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        return input;
    }
}
