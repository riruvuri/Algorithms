package hard.sub_array_k_distinct_integers;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/subarrays-with-k-different-integers/solutions/235235/c-java-with-picture-prefixed-sliding-window/
 *
 * Time Complexity: O(n), where n is the length of A.
 * Space Complexity: O(n).
 */
public class SubarrayWithKDistinctIntegers {

    /*
    public int subArrayWithKUniqueIntegers(int[] input, int k) {
        return kMostCount(input, k) - kMostCount(input, k-1);
    }
    public int kMostCount(int[] input, int k) {
        int l = 0, r = 0, totalCount = 0;
        Map<Integer, Integer> uniqueElementCtrMap = new HashMap<>();
        int counter = 0;

        while (r < input.length) {
            uniqueElementCtrMap.put(input[r], uniqueElementCtrMap.getOrDefault(input[r], 0) + 1);

            while (uniqueElementCtrMap.size() > k) {
                // Remove the left index
                uniqueElementCtrMap.put(input[l], uniqueElementCtrMap.get(input[l]) - 1);

                if (uniqueElementCtrMap.get(input[l]) == 0) {
                    uniqueElementCtrMap.remove(input[l]);
                }

                l++;
            }
            totalCount += (r - l +1);
            counter++;
            r++;
        }

        return totalCount;
    }*/

    public int subArrayWithKUniqueIntegers(int[] input, int k) {
        int l=0, r=0;
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        int prefix = 0;
        int totalCnt = 0;

        while (r < input.length) {
            elementCountMap.put(input[r], elementCountMap.getOrDefault(input[r], 0) + 1);

            // Move left index, when the distinct count exceeds k
            if (elementCountMap.size() > k) {
                // Move the left pointer
                elementCountMap.put(input[l], elementCountMap.getOrDefault(input[l], 0) - 1);

                if (elementCountMap.get(input[l]) == 0) {
                    elementCountMap.remove(input[l]);
                }
                l++;
                prefix = 0;
            }

            // To count all the duplicate occurrences
            while (elementCountMap.get(input[l]) > 1) {
                // Move the left pointer
                elementCountMap.put(input[l], elementCountMap.get(input[l]) - 1);
                l++;
                prefix++;
            }

            if (elementCountMap.size() == k) {
                totalCnt += prefix + 1;
            }
            r++;
        }

        return totalCnt;
    }
}
