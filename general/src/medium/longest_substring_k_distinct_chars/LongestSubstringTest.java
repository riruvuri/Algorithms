package medium.longest_substring_k_distinct_chars;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {
    @Test
    public void simple_test() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int result = longestSubstring.longestSubstringWithKCharacters("ccaabbb", 2);

        Assert.assertTrue(result == 5);
    }
}
