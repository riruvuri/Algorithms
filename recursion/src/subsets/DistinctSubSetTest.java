package subsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DistinctSubSetTest {

    @Test
    public void test_simple() {
        DistinctSubSet distinctSubSet = new DistinctSubSet();
        ArrayList<String> outputList = distinctSubSet.getDistinctSubsets("aab");
        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList("aab", "aa", "ab", "a", "b", ""));

        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }
}
