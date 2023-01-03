package quicksort.algorithm.quick_select;

import org.junit.Assert;
import org.junit.Test;
import quicksort.algorithm.QuickSort;

import java.util.Arrays;

public class QuickSelectTest {

    @Test
    public void test_kthLargest() {
        QuickSelect quickSelect = new QuickSelect();
        int result = quickSelect.findKthLargest(new int[] {5,3,6,9,1,2,4}, 2);
        Assert.assertEquals(6, result);
    }
}
