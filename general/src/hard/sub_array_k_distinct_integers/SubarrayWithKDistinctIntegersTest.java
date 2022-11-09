package hard.sub_array_k_distinct_integers;

import org.junit.Assert;
import org.junit.Test;

public class SubarrayWithKDistinctIntegersTest {

    @Test
    public void simple_test() {
        SubarrayWithKDistinctIntegers subarrayWithKDistinctIntegers = new SubarrayWithKDistinctIntegers();
        int result = subarrayWithKDistinctIntegers.subArrayWithKUniqueIntegers(new int[]{1,2,1,2,3}, 2);

        Assert.assertTrue(result == 7);
    }

    @Test
    public void simple_test_alt() {
        SubarrayWithKDistinctIntegers subarrayWithKDistinctIntegers = new SubarrayWithKDistinctIntegers();
        int result = subarrayWithKDistinctIntegers.subArrayWithKUniqueIntegers(new int[]{1,2,1,3,4}, 3);

        Assert.assertTrue(result == 3);
    }
}
