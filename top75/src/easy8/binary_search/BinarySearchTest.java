package easy8.binary_search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void simple_test() {
        int[] input = {-1,0,3,5,9,12};
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(input, 9);

        Assert.assertTrue(result == 4);
    }
}
