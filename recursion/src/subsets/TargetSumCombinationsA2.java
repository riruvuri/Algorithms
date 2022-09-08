package subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class TargetSumCombinationsA2 {
    static ArrayList<ArrayList<Integer>> generate_all_combinations(ArrayList<Integer> input, Integer target) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();
        int currentIndex = 0;
        int currentSum = 0;
        Collections.sort(input);

        helper(input, currentIndex, slate, outputList, target, currentSum);

        return outputList;
    }

    static void helper(ArrayList<Integer> input, int currentIndex, Stack<Integer> slate,
                       ArrayList<ArrayList<Integer>> outputList, Integer target, int currentSum) {
        if (currentSum == target) {
            outputList.add(new ArrayList<>(slate.stream().toList()));
            return;
        }

        if (currentIndex >= input.size()) {
            return;
        }

        Integer prevValue = null;
        for (int nextIndex = currentIndex; nextIndex < input.size(); nextIndex++) {
            Integer nextValue = input.get(nextIndex);
            if (prevValue == null || !prevValue.equals(nextValue)) {
                prevValue = nextValue;
                slate.push(nextValue);
                helper(input, nextIndex+1, slate, outputList, target, currentSum + nextValue);
                slate.pop();
            }
        }

        return;

    }
}
