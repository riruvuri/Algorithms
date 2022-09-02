package subsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetTest {

    @Test
    public void test_simple() {
        SubSet subSet = new SubSet();
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        List<List<Integer>> outputList = subSet.printSubSets(inputList);
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(),
                                                            Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
                                                            Arrays.asList(1,2), Arrays.asList(1,3), Arrays.asList(2,3),
                                                            Arrays.asList(1,2,3));
        Assert.assertTrue(outputList.size() == expectedList.size()
                                    && outputList.containsAll(expectedList)
                                    && expectedList.containsAll(outputList));
    }

    @Test
    public void test_simple_min() {
        SubSet subSet = new SubSet();
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        List<List<Integer>> outputList = subSet.printSubSets(inputList);
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(),
                Arrays.asList(1), Arrays.asList(2),
                Arrays.asList(1,2));
        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }
}
