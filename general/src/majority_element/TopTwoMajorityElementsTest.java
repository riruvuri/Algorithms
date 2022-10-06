package majority_element;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TopTwoMajorityElementsTest {
    @Test
    public void test_simple() {
        TopTwoMajorityElements topTwoMajorityElements = new TopTwoMajorityElements();
        List<Integer> resultList = topTwoMajorityElements.majorityElement(new int[]{1,1,1,2,2,2,3,3});

        Assert.assertEquals(Arrays.asList(1, 2), resultList);
    }
}
