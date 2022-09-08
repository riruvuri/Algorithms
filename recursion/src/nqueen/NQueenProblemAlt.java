package nqueen;

import java.util.*;
import java.util.stream.*;


class NQueenProblemAlt {

    public static void main(String[] args) {
        NQueenProblemAlt nQueenProblemAlt = new NQueenProblemAlt();
        nQueenProblemAlt.placeQueen(4);
    }
    public List<List<Integer>> placeQueen(int n) {
        List<List<Integer>> outputList = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();
        int currentRow = 0;

        helper(currentRow, 0, n, slate, outputList);

        return outputList;
    }

    private void helper(int currentRow, int currentColumn, int n, Stack<Integer> slate, List<List<Integer>> outputList) {
        if (currentRow == n) {
            outputList.add(slate.stream().toList());
            return;
        }

        for (int j=currentColumn; j < n; j++) {
            slate.push(j);
            if (currentRow == 0 || isValidSlot(currentRow, slate)) {
                helper(currentRow+1, currentColumn, n, slate, outputList);
            }
            slate.pop();
        }
    }

    private boolean isValidSlot(int currentRow, Stack<Integer> slate) {
        List<Integer> slateList = slate.stream().toList();

        // Check if the same column has any value

        int previous = slateList.get(currentRow);
        for (int i=currentRow - 1; i >=0; i--) {
            int current = slateList.get(i);

            if (current == previous) {
                return false;
            }

            if (Math.abs(current - previous) == currentRow - i) {
                return false;
            }
        }

        // Check if the diagonal values found

        return true;
    }
}
