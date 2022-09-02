package nqueen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NQueenProblem {

    public ArrayList<ArrayList<String>> findAllArrangements(Integer n) {
        ArrayList<ArrayList<String>> outputList = new ArrayList<ArrayList<String>>();
        Stack<Integer> slate = new Stack<>();
        int currentRow = 0;
        helper(n, currentRow, slate, outputList);
        return outputList;
    }

    private void helper(Integer n, int currentRow, Stack<Integer> slate, ArrayList<ArrayList<String>> outputList) {
        if (slate.size() >= n) {
            List<Integer> output = slate.stream().toList();

            // Build a string output
            ArrayList<String> outputStrings = new ArrayList<>();
            for (int i=0; i < output.size(); i++) {
                char[] dummy = new char[n];
                Arrays.fill(dummy, 'x');
                dummy[output.get(i)] = 'q';
                outputStrings.add(new String(dummy));
            }
            outputList.add(outputStrings);
            return;
        }

        for (int j=0; j < n; j++) {
            slate.push(j);
            if (currentRow == 0 || !checkWithPreviousRow(currentRow, slate)) {
                helper(n, currentRow+1, slate, outputList);
            }

            slate.pop();
        }
    }

    private boolean checkWithPreviousRow(int currentRow, Stack<Integer> slate) {
        List<Integer> existingPositionList = slate.stream().toList();
        if (existingPositionList.size() > 1) {
            Integer current = existingPositionList.get(currentRow);
            for (int j = currentRow - 1; j >= 0; j--) {
                Integer previous = existingPositionList.get(j);
                if (previous == current
                    || Math.abs(previous - current) == currentRow - j) {
                    return true;
                }
            }
        }

        return false;
    }
}