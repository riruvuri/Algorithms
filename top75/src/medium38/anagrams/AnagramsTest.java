package medium38.anagrams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AnagramsTest {

    @Test
    public void simple_test() {
        String str = "cbaebabacd";
        String ang = "abc";

        Anagrams anagrams = new Anagrams();
        List<Integer> indexes = anagrams.findAnagrams(str, ang);
        Assert.assertEquals(Arrays.asList(0, 6), indexes);
    }

    @Test
    public void simple_test_multi() {
        String str = "abab";
        String ang = "ab";

        Anagrams anagrams = new Anagrams();
        List<Integer> indexes = anagrams.findAnagrams(str, ang);
        Assert.assertEquals(Arrays.asList(0, 1, 2), indexes);
    }
}
