package medium.longest_string_chain;

import org.junit.Assert;
import org.junit.Test;

public class LongestStringChainTest {

    @Test
    public void simple_test() {
        LongestStringChain longestStringChain = new LongestStringChain();
        int result = longestStringChain.longestStrChain(new String[]{"a","b","ba","bca","bda","bdca"});
        Assert.assertTrue(result == 4);
    }

    @Test
    public void simple_test_alt() {
        LongestStringChain longestStringChain = new LongestStringChain();
        int result = longestStringChain.longestStrChain(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"});
        Assert.assertTrue(result == 5);
    }
}
