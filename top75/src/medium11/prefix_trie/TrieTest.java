package medium11.prefix_trie;

import org.junit.Assert;
import org.junit.Test;

public class TrieTest {
    @Test
    public void simple_test() {
        Trie trie = new Trie();
        trie.insert("apple");

        boolean searchResult = trie.search("apple");
        Assert.assertTrue(searchResult);

        searchResult = trie.search("app");
        Assert.assertFalse(searchResult);

        searchResult = trie.startsWith("app");
        Assert.assertTrue(searchResult);

        trie.insert("app");

        searchResult = trie.search("app");
        Assert.assertTrue(searchResult);
    }
}
