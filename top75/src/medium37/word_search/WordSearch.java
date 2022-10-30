package medium37.word_search;

/**
 * T(n) = O(n * m * dfs)
 * T(n) = O(n * m * 4 ^ n)
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
