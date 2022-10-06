package easy19.majority_element;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {
    @Test
    public void test_simple() {
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2});
        Assert.assertTrue(result ==2);
    }

    @Test
    public void test_simple_alt() {
        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.majorityElement(new int[]{3,2,3});
        Assert.assertTrue(result ==3);
    }
}
