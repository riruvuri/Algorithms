package hard.longest_parenthesis;

import org.junit.Assert;
import org.junit.Test;

public class LongestParenthesisAltTest {
    @Test
    public void simple_test() {
        LongestParenthesisAlt longestParenthesisAlt = new LongestParenthesisAlt();
        int result = longestParenthesisAlt.findLongestParenthesis(")()()()");
        Assert.assertTrue(result == 6);
    }

    @Test
    public void simple_test_alt() {
        LongestParenthesisAlt longestParenthesisAlt = new LongestParenthesisAlt();
        int result = longestParenthesisAlt.findLongestParenthesis(")()(()");
        Assert.assertTrue(result == 2);
    }

    @Test
    public void simple_test_alt1() {
        LongestParenthesisAlt longestParenthesisAlt = new LongestParenthesisAlt();
        int result = longestParenthesisAlt.findLongestParenthesis(")(()");
        Assert.assertTrue(result == 2);
    }
}
