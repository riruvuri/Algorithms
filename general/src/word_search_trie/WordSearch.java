package word_search_trie;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=asbcE9mZz_U
 */
public class WordSearch {
    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        // Add dictionary to trie
        for (String word : words) {
            trie.insert(word);
        }

        List<String> resultList = new ArrayList<>();

        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
                dfs(i, j, board, trie.getRoot(), resultList, "");
            }
        }
        return resultList;
    }

    private void dfs(int i, int j,
                        char[][] board, TrieNode node, List<String> resultList, String word) {
        if (i < 0 || j < 0
                || i > board.length-1 || j > board[0].length - 1
                || !node.children.containsKey(board[i][j])) {
            return;
        }
        char temp = board[i][j];
        node = node.children.get(temp);
        word += temp;
        if (node.isWord) {
            resultList.add(word);
        }
        board[i][j] = ' ';

        dfs(i+1, j, board, node, resultList, word);
        dfs(i-1, j, board, node, resultList, word);
        dfs(i, j-1, board, node, resultList, word);
        dfs(i, j+1, board, node, resultList, word);

        board[i][j] = temp;
    }
}
