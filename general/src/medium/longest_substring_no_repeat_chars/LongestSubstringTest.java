package medium.longest_substring_no_repeat_chars;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {
    @Test
    public void simple_test() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int result = longestSubstring.lengthOfLongestSubstring("abcabcbb");

        Assert.assertTrue(result == 3);
    }
}
