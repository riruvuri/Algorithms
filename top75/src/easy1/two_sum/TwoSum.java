package easy1.two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] findTarget(int[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < input.length; i++) {
            if (map.containsKey(target - input[i])) {
                return new int[]{map.get(target - input[i]), i};
            }
            map.put(input[i], i);
        }

        return new int[]{};
    }
}
