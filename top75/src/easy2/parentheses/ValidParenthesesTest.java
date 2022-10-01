package easy2.parentheses;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void sample_test() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("()[]{}");

        Assert.assertTrue(result);
    }

    @Test
    public void sample_test_failure() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("(][)");

        Assert.assertTrue(!result);
    }
}
