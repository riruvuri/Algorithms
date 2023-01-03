package application.longest_common_prefix;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefixStrings() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});

        Assert.assertEquals("fl", prefix);
    }


    @Test
    public void longestCommonPrefixStringsDnC() {
        LongestCommonPrefixDivideNConquer longestCommonPrefix = new LongestCommonPrefixDivideNConquer();
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});

        Assert.assertEquals("fl", prefix);
    }

    @Test
    public void longestCommonPrefixStringsBS() {
        LongestCommonPrefixBS longestCommonPrefix = new LongestCommonPrefixBS();
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});

        Assert.assertEquals("fl", prefix);
    }
}
