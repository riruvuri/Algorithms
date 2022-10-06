package medium5.longest_substring;

import org.junit.Assert;
import org.junit.Test;

public class SubstringWithoutRepeatCharTest {
    @Test
    public void simple_test() {
        SubstringWithoutRepeatChar substringWithoutRepeatChar = new SubstringWithoutRepeatChar();
        int result = substringWithoutRepeatChar.longestSubstr("abcabcbb");
        Assert.assertTrue(result == 3);
    }
}
