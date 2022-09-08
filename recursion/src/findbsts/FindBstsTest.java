package findbsts;

import org.junit.Assert;
import org.junit.Test;

public class FindBstsTest {

    @Test
    public void test_simple() {
        FindBsts findBsts = new FindBsts();
        int bstCount = findBsts.findBstCount(5);

        Assert.assertEquals(42, bstCount);
    }
}
