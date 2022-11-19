package subsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSubSetTest {
    @Test
    public void simple_test() {
        UniqueSubSet uniqueSubSet = new UniqueSubSet();
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(2);
        List<List<Integer>> outputList = uniqueSubSet.printSubSets(inputList);
        String outputStrList =  outputList.stream().map(List::toString).collect(Collectors.joining());
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(),
                Arrays.asList(1), Arrays.asList(2),
                Arrays.asList(1,2), Arrays.asList(2,2),
                Arrays.asList(1,2,2));
        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }
}
