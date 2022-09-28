package slidingwindow.min_window_substring;

import org.junit.Assert;
import org.junit.Test;

public class MinWindowSubstringTest {

    @Test
    public void test_min_window() {
        MinWindowSubstring minWindowSubstring = new MinWindowSubstring();
        String result = minWindowSubstring.minWindow("ADOBECODEBANC", "ABC");

        Assert.assertEquals("BANC", result);
    }
}
