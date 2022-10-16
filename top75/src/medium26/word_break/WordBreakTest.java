package medium26.word_break;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WordBreakTest {
    @Test
    public void simple_test() {
        List<String> dictionary = Arrays.asList("rock", "star", "rocks");
        WordBreak wordBreak = new WordBreak();
        boolean result = wordBreak.hasWordBreaks("rockstar", dictionary);
        Assert.assertTrue(result);
    }
}
