package medium.longest_substring_two_distinct_chars;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {
    @Test
    public void simple_test() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int result = longestSubstring.longestSubstringWithTwoDistinct("ccaabbb");

        Assert.assertTrue(result == 5);
    }
}
