package medium.min_increment_to_array_unique;

import org.junit.Assert;
import org.junit.Test;

public class UniqueArrayTest {

    @Test
    public void simple_test() {
        UniqueArray uniqueArray = new UniqueArray();
        int result = uniqueArray.minIncrementForUnique(new int[]{1,2,2});

        Assert.assertTrue(result == 1);
    }

    @Test
    public void simple_test_alt() {
        UniqueArray uniqueArray = new UniqueArray();
        int result = uniqueArray.minIncrementForUnique(new int[]{3,2,1,2,1,7});

        Assert.assertTrue(result == 6);
    }
}
