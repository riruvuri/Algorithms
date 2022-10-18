package medium2.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Good solution:
https://www.youtube.com/watch?v=K7B9ZTKoRpQ
 */
public class InsertInterval {
    public int[][] insert (int[][] intervals, int[] newInterval) {
        List<int[]> outputList = new LinkedList<>();

        // 1. Add all intervals that end before the start of the new interval
        int i = 0, n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            outputList.add(intervals[i++]);
        }

        // 2. Merge new interval with the overlapping interval
        while (i < n && intervals[i][0] < newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        outputList.add(newInterval);

        // 3. Add the remaining to the list
        while(i < n) {
            outputList.add(intervals[i++]);
        }

        return outputList.toArray(new int[outputList.size()][2]);
    }
}
