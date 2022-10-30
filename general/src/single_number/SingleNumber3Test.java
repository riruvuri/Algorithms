package single_number;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber3Test {

    @Test
    public void simple_test() {
        SingleNumber3 singleNumber3 = new SingleNumber3();
        int[] result = singleNumber3.findTwoNumbers(new int[]{1,2,1,3,2,5});
        Assert.assertArrayEquals(new int[]{5, 3}, result);
    }
}
