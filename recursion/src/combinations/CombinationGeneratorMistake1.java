package combinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Possible mistakes in writing recursion
 */
class CombinationGeneratorMistake1 {
    public List<List<Integer>> generateCombinations(int n, int k) {
        List<List<Integer>> outputList = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();
        int currentElement = 1;

        helper(currentElement, slate, outputList, n, k);
        return outputList;
    }

    private void helper(int currentElement, Stack<Integer> slate, List<List<Integer>> outputList, int n, int k) {
        if (slate.size() == k) {
            outputList.add(slate.stream().toList());
            return;
        }

        if (currentElement > n) {
            return;
        }

        slate.add(currentElement);
        helper(currentElement+1, slate, outputList, n, k);
        slate.pop();

        /*
        for (int i = currentElement; i <= n; i++) {
            slate.add(i);
            helper(i+1, slate, outputList, n, k);
            slate.pop();
        }*/
    }
}
