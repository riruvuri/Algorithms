package application.bucketsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=YPTqKIgVk-k
 *
 * T(n) = O(n)
 * S(n)= O(n)
 */
public class TopKFrequentElements {

    public int[] topKElements(int[] input, int k) {
        // Find the count of the occurrence of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        List<List<Integer>> frequencyCounts = new ArrayList<>();
        for (int i=0; i < input.length; i++) {
            frequencyCounts.add(new ArrayList<>());
        }
        for (int i : input) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        // Unique elements with counts
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();

            frequencyCounts.get(val).add(key);
        }

        List<Integer> output = new ArrayList<>();
        for (int i = frequencyCounts.size() - 1; i >=0 ; i--) {
            if (frequencyCounts.get(i).size() > 0) {
                List<Integer> elements = frequencyCounts.get(i);
                int j= 0;
                while (k-- > 0 && j < elements.size()) {
                    output.add(elements.get(j++));
                }
            }
        }

        return output.stream().mapToInt(Integer::intValue).toArray();

    }
}
