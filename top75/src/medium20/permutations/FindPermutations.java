package medium20.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindPermutations {
    List<List<Integer>> outputList = null;
    int[] nums = null;
    public List<List<Integer>> permute(int[] nums) {
        outputList = new ArrayList<>();
        this.nums = nums;
        permuteHelper(0);

        return outputList;
    }

    private void permuteHelper(int fixedIndex) {
        // Base case
        if (fixedIndex == nums.length) {
            outputList.add(IntStream.of(nums).boxed().toList());
            return;
        }

        for (int i=fixedIndex; i < nums.length; i++) {
            swap(nums, i, fixedIndex);
            permuteHelper(fixedIndex+1);
            swap(nums, i, fixedIndex);
        }

    }

    private void swap(int[] nums, int i, int fixedIndex) {
        int temp = nums[i];
        nums[i] = nums[fixedIndex];
        nums[fixedIndex] = temp;
    }


}
