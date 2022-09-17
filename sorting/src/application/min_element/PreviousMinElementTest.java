package application.min_element;

import org.junit.Assert;
import org.junit.Test;

public class PreviousMinElementTest {

    @Test
    public void sample_test() {
        PreviousMinElement previousMinElement = new PreviousMinElement();
        int[] output = previousMinElement.findPreviousMinElement(new int[] {1,6,4,10,2,5});
        Assert.assertArrayEquals(new int[]{0,1,1,4,1,2}, output);
    }

    @Test
    public void sample_test_diff_input() {
        PreviousMinElement previousMinElement = new PreviousMinElement();
        int[] output = previousMinElement.findPreviousMinElement(new int[] {1,3,0,2,5});
        Assert.assertArrayEquals(new int[]{0,1,0,0,2}, output);
    }
}
