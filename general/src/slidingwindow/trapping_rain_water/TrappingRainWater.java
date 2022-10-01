package slidingwindow.trapping_rain_water;

import java.util.Arrays;
import java.util.Stack;

public class TrappingRainWater {

    public int totalTrappedWater(int[] input) {
        // find max left
        int[] maxLeft = new int[input.length];
        //Arrays.fill(maxLeft, -1);
        Stack<Integer> slate = new Stack<>();
        for (int i=0; i < input.length; i++) {
            while (!slate.isEmpty()) {
                int lastElement = slate.peek();

                if (input[lastElement] < input[i]) {
                    maxLeft[i] = input[lastElement];
                    slate.pop();
                } else {
                    maxLeft[i] = input[lastElement];
                    break;
                }
            }
            slate.push(i);

        }

        // find max right
        int[] maxRight = new int[input.length];

        return 0;
    }
}
