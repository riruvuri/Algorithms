package parenthesis;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ParenthesisTest {

    @Test
    public void test_simple_parenthesis() {
        Parenthesis parenthesis = new Parenthesis();
        List<String> outputList = parenthesis.generateWellFormedParenthesis(3);

        List<String> expectedList = Arrays.asList("((()))", "()()()",
                                                    "(())()", "()(())",
                                                    "(()())");

        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }
}
