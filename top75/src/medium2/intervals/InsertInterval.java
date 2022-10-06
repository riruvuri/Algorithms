package medium2.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public int[][] insert (int[][] intervals, int[] newInterval) {

        int[] previous = intervals[0];
        List<List<Integer>> outputList = new ArrayList<>();
        for (int i=1; i < intervals.length; i++) {
            int[] currentInt = intervals[i];

            boolean addPrevious = false;
            if (currentInt[1] <= newInterval[0]
                    || previous[1] >= newInterval[0]) {
                // check overlap
                if (newInterval[1] >= currentInt[1]) {
                    previous[1] = newInterval[1];
                } else {
                    previous[1] = currentInt[1];
                }

                addPrevious = true;
            } else {
                outputList.add(Arrays.asList(previous[0], previous[1]));
                previous = currentInt;
            }

            if (i == intervals.length - 1) {
                if (addPrevious) {
                    outputList.add(Arrays.asList(previous[0], previous[1]));
                    outputList.add(Arrays.asList(currentInt[0], currentInt[1]));
                }
            }

        }

        int[][] outputArr = new int[outputList.size()][];
        int i=0;
        for (List<Integer> output : outputList) {
            outputArr[i++] = new int[]{output.get(0), output.get(1)};
        }
        return outputArr;
    }
}
