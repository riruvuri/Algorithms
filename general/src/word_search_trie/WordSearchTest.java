package word_search_trie;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WordSearchTest {
    @Test
    public void simple_test() {
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};
        WordSearch wordSearch = new WordSearch();
        List<String> wordList = wordSearch.findWords(board, words);

        Assert.assertEquals(Arrays.asList("oath", "eat"), wordList);
    }
}
