package slidingwindow.longest_substring;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubStringTest {

    @Test
    public void test_longest_substr() {
        String str = "abcabcbb";
        LongestSubString longestSubString = new LongestSubString();
        int result = longestSubString.lengthOfLongestSubStr(str);

        Assert.assertEquals(3, result);
    }

    @Test
    public void test_longest_substr_unique() {
        String str = "bbbbb";
        LongestSubString longestSubString = new LongestSubString();
        int result = longestSubString.lengthOfLongestSubStr(str);

        Assert.assertEquals(1, result);
    }

    @Test
    public void test_longest_substr_unique_dup() {
        String str = "nhkyylsi";
        LongestSubString longestSubString = new LongestSubString();
        int result = longestSubString.lengthOfLongestSubStr(str);

        Assert.assertEquals(4, result);
    }
}
