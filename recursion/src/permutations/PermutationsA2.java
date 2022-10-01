package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermutationsA2 {
    public static void main(String[] args) {

        PermutationsA2.get_permutations(new ArrayList<>(IntStream.of(new int[]{1,2,3}).boxed().toList()));
    }

    static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> input) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        helper(input, 0, outputList);
        return outputList;
    }

    private static void helper(ArrayList<Integer> input, int fixedIndex, ArrayList<ArrayList<Integer>> outputList) {
        if (fixedIndex == input.size()) {
            outputList.add(new ArrayList<>(input));
            return;
        }

        for (int i=fixedIndex; i < input.size(); i++) {
            Collections.swap(input, fixedIndex, i);
            helper(input, fixedIndex + 1, outputList);
            Collections.swap(input, fixedIndex, i);
        }
    }


}
