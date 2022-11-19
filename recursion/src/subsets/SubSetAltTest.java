package subsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SubSetAltTest {
    @Test
    public void simple_test() {
        SubSetAlt subSetAlt = new SubSetAlt();
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        List<List<Integer>> outputList = subSetAlt.printSubSets(inputList);
        String outputStrList =  outputList.stream().map(List::toString).collect(Collectors.joining());
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(),
                                            Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
                                            Arrays.asList(1,2), Arrays.asList(1,3), Arrays.asList(2,3),
                                            Arrays.asList(1,2,3));
        Assert.assertTrue(outputList.size() == expectedList.size()
                                && outputList.containsAll(expectedList)
                                && expectedList.containsAll(outputList));
    }

}
