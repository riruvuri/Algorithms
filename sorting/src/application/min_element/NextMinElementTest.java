package application.min_element;

import org.junit.Assert;
import org.junit.Test;

public class NextMinElementTest {

    @Test
    public void sample_test() {
        NextMinElement nextMinElement = new NextMinElement();
        int[] output = nextMinElement.findNextMinElement(new int[] {4,8,5,2,25});
        Assert.assertArrayEquals(new int[]{2,5,2,0,0}, output);
    }
}
