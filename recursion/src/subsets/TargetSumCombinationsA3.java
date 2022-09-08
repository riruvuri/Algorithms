package subsets;

import java.util.ArrayList;
import java.util.Collections;

public class TargetSumCombinationsA3 {
    static ArrayList<ArrayList<Integer>> generate_all_combinations(ArrayList<Integer> input, Integer target) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        ArrayList<Integer> slate = new ArrayList<>();
        int currentIndex = 0;
        int currentSum = 0;
        Collections.sort(input);

        helper(input, currentIndex, slate, outputList, target, currentSum);

        return outputList;
    }

    static void helper(ArrayList<Integer> input, int currentIndex, ArrayList<Integer> slate,
                       ArrayList<ArrayList<Integer>> outputList, Integer target, int currentSum) {
        if (currentSum == target) {
            outputList.add(new ArrayList<>(slate));
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
                slate.add(nextValue);
                //generateCombinationSum(input, target, results, candidate, nextIndex + 1, runningSum + nextValue);
                helper(input, nextIndex+1, slate, outputList, target, currentSum + nextValue);
                slate.remove(slate.size()-1);
            }
        }

        return;

    }
}
