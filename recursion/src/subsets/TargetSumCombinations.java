package subsets;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class TargetSumCombinations {

    static ArrayList<ArrayList<Integer>> generate_all_combinations(ArrayList<Integer> input, Integer target) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();
        int currentIndex = 0;
        int currentSum = 0;

        // Collections.sort(input);

        helper(input, currentIndex, slate, outputList, target, currentSum);

        return outputList;
    }

    static void helper(ArrayList<Integer> input, int currentIndex, Stack<Integer> slate,
                       ArrayList<ArrayList<Integer>> outputList, Integer target, int currentSum) {
        if (currentIndex == input.size()) {
            int currentTotal = slate.stream().collect(Collectors.summingInt(Integer::intValue));
            if (currentTotal == target) {
                outputList.add(new ArrayList<>(slate.stream().toList()));
            }
            return;
        }

        slate.push(input.get(currentIndex));
        helper(input, currentIndex+1, slate, outputList, target, currentSum + input.get(currentIndex));
        slate.pop();

        while (currentIndex < input.size()-1
                && input.get(currentIndex) == input.get(currentIndex+1)) {
            currentIndex++;
        }

        helper(input, currentIndex+1, slate, outputList, target, currentSum + input.get(currentIndex));


    }
}
