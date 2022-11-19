package medium37.word_search;

/**
 * LC: 79
 *
 * T(n) = O(n * m * dfs)
 * T(n) = O(n * m * 4 ^ l)
 * Total number of cells in the grid= n * m, can be represented as 'N'
 * Length of the sting to be matched: L
 * T(n) = O(N * 4 ^ L)
 *
 * Space complexity: O(L)
 * The maximum length of call stack is the length of the word.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
                if (dfs(i, j, board, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j,
                        char[][] board, String word, int currentIndex) {
        if (currentIndex == word.length()) {
            return true;
        }

        if (i < 0 || j < 0
                || i > board.length-1 || j > board[0].length - 1
                || board[i][j] != word.charAt(currentIndex)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';

        boolean result =  dfs(i+1, j, board, word, currentIndex+1)
                            || dfs(i-1, j, board, word, currentIndex+1)
                            || dfs(i, j-1, board, word, currentIndex+1)
                            || dfs(i, j+1, board, word, currentIndex+1);

        board[i][j] = temp;
        return result;
    }
}
