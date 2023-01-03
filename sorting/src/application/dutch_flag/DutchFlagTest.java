package application.dutch_flag;

import org.junit.Assert;
import org.junit.Test;

public class DutchFlagTest {
    @Test
    public void simple_test() {
        char[] balls = {'G', 'B', 'G', 'G', 'R', 'B', 'R', 'G'};
        DutchFlag dutchFlag = new DutchFlag();
        dutchFlag.dutchFlagSort(balls);

        Assert.assertArrayEquals(new char[]{'R','R','G','G','G','G','B','B'}, balls);
    }
}
