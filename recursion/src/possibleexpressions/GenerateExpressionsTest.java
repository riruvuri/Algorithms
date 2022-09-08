package possibleexpressions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GenerateExpressionsTest {

    @Test
    public void sample_test() {
        GenerateExpressions generateExpressions = new GenerateExpressions();
        List<String> outputList = generateExpressions.generateExpressions("222", 6);

        List<String> expectedList = Arrays.asList("2*2+2", "2+2*2", "2+2+2");

        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));

    }
}
