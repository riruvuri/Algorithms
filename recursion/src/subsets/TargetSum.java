package subsets;

import java.util.ArrayList;

/*
Given a set of integers and a target value k, find whether there is a non-empty subset that sums up to k.

{
"arr": [2, 4, 8],
"k": 6
}
Return: 1

Approach 1:
    Brute-force approach is to find all the subsets and compute the sum.
    The number of subsets that are possible is: 2 ^ n
    Time complexity: O(2 ^ n)
    Time complexity at the leaf level node: O(2 ^ n * n)

Approach 2:
    Instead of finding all the subsets and looking for the sum, do this after every subset and return
    if the subset sum matches with the target.
 */
public class TargetSum {
    public Boolean checkTargetSum(ArrayList<Long> inputList, Long targetSum) {

        int currentIndex = 0;
        int sum = 0;
        int count = 0;
        boolean targetSumFound = targetSumHelper(inputList, targetSum, sum, currentIndex, count);
        return targetSumFound;
    }

    private boolean targetSumHelper(ArrayList<Long> inputList, Long targetSum, long sum, int currentIndex, int count) {
        if (count != 0 && sum == targetSum) {
            return true;
        }

        if (currentIndex >= inputList.size()) {
            return false;
        }

        long elementToInclude = inputList.get(currentIndex);
        boolean targetSumFound = targetSumHelper(inputList, targetSum,
                                                sum + elementToInclude,
                                            currentIndex + 1, count + 1);

        if (!targetSumFound) {
            targetSumFound = targetSumHelper(inputList, targetSum, sum,currentIndex + 1, count + 1);
        }

        return targetSumFound;
    }
}
