package subsets;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UniqueSubSet {
    public List<List<Integer>> printSubSets(List<Integer> input) {
        List<List<Integer>> outputList = new ArrayList<>();
        Stack slate = new Stack();
        helper(input, 0, slate, outputList);

        return outputList;
    }

    private void helper(List<Integer> input, int currentIndex, Stack<Integer> slate, List<List<Integer>> outputList) {
        // Base case
        outputList.add(slate.stream().toList());

        for (int i=currentIndex; i < input.size(); i++) {

            if (i != currentIndex && input.get(i) == input.get(i-1)) {
                continue;
            }

            // Recursive case
            slate.push(input.get(i));
            helper(input, i +1, slate, outputList);
            slate.pop();
        }
    }
}
