package easy17.longest_palindrome;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void sample_test() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        int result = longestPalindrome.longestPalindrome("abccccdd");

        Assert.assertTrue(result == 7);
    }

    @Test
    public void sample_test_alt() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        int result = longestPalindrome.longestPalindrome("a");

        Assert.assertTrue(result == 1);
    }

    @Test
    public void sample_test_alt2() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        int result = longestPalindrome.longestPalindrome("aaabbbbb");

        Assert.assertTrue(result == 7);
    }
}
