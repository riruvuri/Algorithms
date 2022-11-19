package medium37.word_search;

class WordSearchAlt {
    public boolean exist(char[][] board, String word) {
        boolean hasMatch = false;
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && !hasMatch) {
                    hasMatch = wsHelper(board, i, j, word, 0);
                }
            }
        }
        return hasMatch;
    }

    boolean wsHelper(char[][] board, int row, int col, String word, int wordIndex) {
        if (wordIndex == word.length()) {
            return true;
        }

        if (row < 0 || row == board.length
                || col < 0 || col == board[0].length
                || board[row][col] == '0'
                || board[row][col] != word.charAt(wordIndex)) {
            return false;
        }

        boolean hasMatch = false;
        char temp = board[row][col];
        board[row][col] = '0';

        // Find neighbors
        int[][] directions = {{0,1},{1,0},{-1,0},{0, -1}};
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            hasMatch = wsHelper(board, newRow, newCol, word, wordIndex + 1);
            if (hasMatch) {
                break;
            }
        }

        board[row][col] = temp;


        return hasMatch;
    }
}
