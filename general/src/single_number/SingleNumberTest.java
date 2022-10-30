package single_number;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void simple_test() {
        SingleNumber singleNumber = new SingleNumber();
        int result = singleNumber.findSingleNumber(new int[]{2,2,1});

        Assert.assertTrue(result == 1);
    }
}
