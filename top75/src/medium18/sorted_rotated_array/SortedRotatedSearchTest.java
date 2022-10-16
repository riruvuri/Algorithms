package medium18.sorted_rotated_array;

import org.junit.Assert;
import org.junit.Test;

public class SortedRotatedSearchTest {
    @Test
    public void simple_test() {
        SortedRotatedSearch sortedRotatedSearch = new SortedRotatedSearch();
        int targetIndex = sortedRotatedSearch.search(new int[] {4,5,6,7,0,1,2}, 0);

        Assert.assertTrue(targetIndex == 4);
    }
}
