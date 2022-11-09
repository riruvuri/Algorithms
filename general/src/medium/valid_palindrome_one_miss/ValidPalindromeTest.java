package medium.valid_palindrome_one_miss;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {
    @Test
    public void simple_test() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.validPalindrome("abca");

        Assert.assertTrue(result);
    }
}
