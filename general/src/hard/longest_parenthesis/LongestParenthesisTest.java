package hard.longest_parenthesis;

import org.junit.Assert;
import org.junit.Test;

public class LongestParenthesisTest {
    @Test
    public void simple_test() {
        LongestParenthesis longestParenthesis = new LongestParenthesis();
        int result = longestParenthesis.findLongestParenthesis(")()()()");
        Assert.assertTrue(result == 6);
    }

    @Test
    public void simple_test_alt() {
        LongestParenthesis longestParenthesis = new LongestParenthesis();
        int result = longestParenthesis.findLongestParenthesis(")()(()");
        Assert.assertTrue(result == 2);
    }

    @Test
    public void simple_test_alt1() {
        LongestParenthesis longestParenthesis = new LongestParenthesis();
        int result = longestParenthesis.findLongestParenthesis(")(()");
        Assert.assertTrue(result == 2);
    }
}
