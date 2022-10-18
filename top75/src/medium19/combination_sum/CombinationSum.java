package medium19.combination_sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
    int[] input;
    List<List<Integer>> outputList;
    Stack<Integer> stack;
    int target;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.input = candidates;
        stack = new Stack<>();
        outputList = new ArrayList<>();
        this.target = target;
        
        combinationHelper(0, 0);

        return outputList;
    }

    private void combinationHelper(int index, int currentTotal) {
        // Output check
        if (target == currentTotal) {
            outputList.add(new ArrayList<>(stack.stream().toList()));
            return;
        }
        // Failure cases
        if (stack.size() == input.length || currentTotal > target || index == input.length) {
            return;
        }

        // Apply include/exclude strategy
        stack.push(input[index]);
        combinationHelper(index, currentTotal + input[index]);
        stack.pop();

        combinationHelper(index + 1, currentTotal);
    }
}
