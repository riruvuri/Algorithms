package subsets;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a set of distinct integers return all possible subsets.
 */
public class SubSet {
    public List<List<Integer>> printSubSets(List<Integer> input) {
        List<List<Integer>> outputList = new ArrayList<>();
        Stack slate = new Stack();
        helper(input, 0, slate, outputList);
        
        return outputList;
    }

    private void helper(List<Integer> input, int currentIndex, Stack<Integer> slate, List<List<Integer>> outputList) {
        // Base case
        if (input.size() == 0) {
            outputList.add(slate.stream().toList());
            return;
        }

        // Recursive case
        slate.push(input.get(currentIndex));
        input.remove(currentIndex);
        helper(input, currentIndex+1, slate, outputList);
        input.add(slate.pop());

        helper(input, currentIndex+1, slate, outputList);
    }
}