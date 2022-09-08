package combinations;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationGeneratorTest {

    @Test
    public void test_simple() {
        CombinationGenerator combinationGenerator = new CombinationGenerator();
        List<List<Integer>> outputList = combinationGenerator.generateCombination(5, 2);

        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1,2), Arrays.asList(1,3), Arrays.asList(1,4), Arrays.asList(1,5),
                                                            Arrays.asList(2,3), Arrays.asList(2,4), Arrays.asList(2,5),
                                                            Arrays.asList(3,4), Arrays.asList(3,5), Arrays.asList(4,5));
        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }

    @Test
    public void test_simple_include_exclude() {
        CombinationGenerator combinationGenerator = new CombinationGenerator();
        List<List<Integer>> outputList = combinationGenerator.generateCombinationsWithInclusionExclusion(5, 2);

        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1,2), Arrays.asList(1,3), Arrays.asList(1,4), Arrays.asList(1,5),
                Arrays.asList(2,3), Arrays.asList(2,4), Arrays.asList(2,5),
                Arrays.asList(3,4), Arrays.asList(3,5), Arrays.asList(4,5));
        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }

    @Test
    public void test_comibinationgenerator_alt() {
        CombinationGeneratorMistake1 alt = new CombinationGeneratorMistake1();
        alt.generateCombinations(5, 2);
    }
}
