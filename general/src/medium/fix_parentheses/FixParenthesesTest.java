package medium.fix_parentheses;

import org.junit.Assert;
import org.junit.Test;

public class FixParenthesesTest {
    @Test
    public void simple_test() {
        String[] inputArr = {"lee(t(c)o)de)", "a)b(c)d", "))(("};
        String[] expected = {"lee(t(c)o)de", "ab(c)d", ""};
        String[] actual = new String[3];
        FixParentheses fixParentheses = new FixParentheses();
        int i=0;
        for (String input : inputArr) {
            actual[i++] = fixParentheses.minRemoveToMakeValid(input);
        }

        Assert.assertArrayEquals(expected, actual);
    }
}
