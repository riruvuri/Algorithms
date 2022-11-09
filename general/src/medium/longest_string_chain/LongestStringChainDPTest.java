package medium.longest_string_chain;

import org.junit.Assert;
import org.junit.Test;

public class LongestStringChainDPTest {
    @Test
    public void simple_test() {
        LongestStringChainDP longestStringChainDP = new LongestStringChainDP();
        int result = longestStringChainDP.longestStrChain(new String[]{"a","b","ba","bca","bda","bdca"});
        Assert.assertTrue(result == 4);
    }

    @Test
    public void simple_test_alt() {
        LongestStringChainDP longestStringChainDP = new LongestStringChainDP();
        int result = longestStringChainDP.longestStrChain(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"});
        Assert.assertTrue(result == 5);
    }
}
