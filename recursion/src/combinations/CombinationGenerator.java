package combinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationGenerator {
    public List<List<Integer>> generateCombination(int n, int k) {
        List<List<Integer>> outputList = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();

        helper(n, k, 1, slate, outputList);
        return outputList;
    }

    void helper(int n, int k, int start, Stack<Integer> slate, List<List<Integer>> outputList) {
        if (slate.size() == k) {
            outputList.add(slate.stream().toList());
            return;
        }

        for (int i=start; i <=n; i++) {
            slate.push(i);
            helper(n, k, i+1, slate, outputList);
            slate.pop();
        }
    }


    public List<List<Integer>> generateCombinationsWithInclusionExclusion(int n, int k) {
        List<List<Integer>> outputList = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();
        int start = 1;
        helperInclusionExclusion(n, k, start, slate, outputList);

        return outputList;
    }

    private void helperInclusionExclusion(int n, int k, int start, Stack<Integer> slate, List<List<Integer>> outputList) {
        if (slate.size() == 2) {
            outputList.add(slate.stream().toList());
            return;
        }

        if (start > n) {
            return;
        }

        helperInclusionExclusion(n, k, start+1, slate, outputList);

        slate.push(start);
        helperInclusionExclusion(n, k, start+1, slate, outputList);
        slate.pop();
    }
}
