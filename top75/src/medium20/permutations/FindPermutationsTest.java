package medium20.permutations;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindPermutationsTest {
    @Test
    public void simple_test() {
        FindPermutations findPermutations = new FindPermutations();
        List<List<Integer>> resultList = findPermutations.permute(new int[]{1,2,3});
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(1,3, 2),
                                                            Arrays.asList(2,1,3),Arrays.asList(2, 3, 1),
                                                            Arrays.asList(3, 2, 1), Arrays.asList(3, 1, 2));

        Assert.assertTrue(expectedList.equals(resultList));
    }
}
