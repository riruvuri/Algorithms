package medium21.merge_intervals;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a ,b) -> Integer.compare(a[0], b[0]));

        List<int[]> outputList = new ArrayList<>();
        int[] previous = intervals[0];
        for (int i=1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (previous[1] < current[0]) {
                // No overlap
                outputList.add(previous);
            } else {
                current[0] = Math.min(current[0], previous[0]);
                current[1] = Math.max(current[1], previous[1]);
            }

            previous = current;
        }

        if (previous != null) {
            outputList.add(previous);
        }

        return outputList.toArray(new int[][]{});
    }
}
