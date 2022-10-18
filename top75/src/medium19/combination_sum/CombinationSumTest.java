package medium19.combination_sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationSumTest {
    @Test
    public void simple_test() {
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> outputList = combinationSum.combinationSum(new int[]{2,3,6,7}, 7);
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(2,2,3), Arrays.asList(7));

        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }
}
