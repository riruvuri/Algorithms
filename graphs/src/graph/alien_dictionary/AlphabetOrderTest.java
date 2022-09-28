package graph.alien_dictionary;

import graph.bipartite.Bipartite;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AlphabetOrderTest {

    @Test
    public void test_simple() {
        AlphabetOrder alphabetOrder = new AlphabetOrder();
        String result = alphabetOrder.findOrder(new String[] {"baa", "abcd", "abca", "cab", "cad"});

        Assert.assertEquals("bdac", result);
    }

    @Test
    public void test_simple_alt() {
        AlphabetOrder alphabetOrder = new AlphabetOrder();
        String result = alphabetOrder.findOrder(new String[] {"caa", "aaa", "aab"});

        Assert.assertEquals("cab", result);
    }
}
