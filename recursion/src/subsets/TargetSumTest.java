package subsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class TargetSumTest {

    @Test
    public void test_targetSum() {
        TargetSum targetSum = new TargetSum();
        boolean targetSumFound = targetSum.checkTargetSum(new ArrayList<Long>(Arrays.asList(1l,2l,3l)), 3l);

        Assert.assertEquals(true, targetSumFound);
    }

    @Test
    public void test_targetSum_negative() {
        TargetSum targetSum = new TargetSum();
        boolean targetSumFound = targetSum.checkTargetSum(new ArrayList<Long>(Arrays.asList(1l,2l,3l)), 7l);

        Assert.assertEquals(false, targetSumFound);
    }

    @Test
    public void test_targetSum_zero() {
        TargetSum targetSum = new TargetSum();
        boolean targetSumFound = targetSum.checkTargetSum(new ArrayList<>(Arrays.asList(-10l,10l)), 0l);

        Assert.assertEquals(true, targetSumFound);
    }

    @Test
    public void test_targetSum_lengthy_array() {
        TargetSum targetSum = new TargetSum();
        long[] input = {-2, -1, 3, -1, -1, -3, 2, 1, -1, 1, -4, -2, 3, 0, 4, 2, -4, -4};

        boolean targetSumFound = targetSum.checkTargetSum(new ArrayList<Long>(LongStream.of(input).boxed().collect(Collectors.toList())), 0l);

        Assert.assertEquals(true, targetSumFound);
    }
}
