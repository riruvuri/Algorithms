package medium37.word_search;

import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {
    @Test
    public void simple_test() {
        char[][] board = {{'A','B','C','E'}, {'S','F','C', 'S'}, {'A','D','E', 'E'}};
        WordSearch wordSearch = new WordSearch();
        boolean result = wordSearch.exist(board, "ABCCED");
        Assert.assertTrue(result);
    }
}
