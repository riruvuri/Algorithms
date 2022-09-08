package permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Asymptotic complexity in terms of `n` =  size of the input array:
* Time: O(n * n!).
* Auxiliary space: O(n).
* Total space: O(n * n!).
*/
public class Permutations {
    public List<List<Integer>> findPermutations(int[] input) {
        List<Integer> inputList = IntStream.of(input)
                                            .boxed()
                                            .collect(Collectors.toList());
        List<List<Integer>> outputList = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();
        helper(inputList, slate, outputList);
        return outputList;
    }

    private void helper(List<Integer> inputList, Stack<Integer> slate, List<List<Integer>> outputList) {
        // base case
        if (inputList.size() == 0) {
            outputList.add(slate.stream().toList());
            return;
        }

        // Recursion
        for (int i=0; i < inputList.size(); i++) {
            slate.push(inputList.get(i));
            inputList.remove(i);
            helper(inputList, slate, outputList);
            inputList.add(i, slate.pop());
        }
    }
}
