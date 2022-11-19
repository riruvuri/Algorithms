package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayHelperTest {

    @Test
    public void test_longarray_to_list() {
        long[] input = {-2, -1, 3, -1, -1, -3, 2, 1, -1, 1, -4, -2, 3, 0, 4, 2, -4, -4};
        ArrayList<Long> longList = ArrayHelper.convertToList(input);
        Assert.assertTrue(longList != null);
    }

    @Test
    public void test_array_sort() {
        int[][] input = {{2,6},{8,10},{1,3},{15,18}};
        int[][] output = ArrayHelper.sort(input);

        Assert.assertArrayEquals(new int[][]{{1,3},{2,6},{8,10},{15,18}}, output);
    }

    @Test
    public void test_sort_map() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(3, 75);
        map.put(1, 99);
        map.put(2, 85);
        map.put(4, 70);

        int[][] outputArr = ArrayHelper.sortMapOfInts(map);
        Assert.assertArrayEquals(new int[][]{{1,99},{2,85},{3,75},{4,70}}, outputArr);
    }
}
