package application.min_element;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerTower {

    public int[] nearestSmallerTower(int[] input) {
        // Find the next min element index
        int[] nextMinIndex = new int[input.length];
        Arrays.fill(nextMinIndex, -1);
        Stack<Integer> slateIndex = new Stack<>();
        for (int i=input.length-1; i >=0 ; i--) {
            while (!slateIndex.isEmpty()) {
                if (input[slateIndex.peek()] > input[i]) {
                    slateIndex.pop();
                } else {
                    nextMinIndex[i] = slateIndex.peek();
                    break;
                }
            }
            slateIndex.push(i);
        }

        slateIndex.clear();
        int[] prevMinIndex = new int[input.length];
        Arrays.fill(prevMinIndex, -1);
        for (int i=0; i < input.length; i++) {
            while (!slateIndex.isEmpty()) {
                if (input[slateIndex.peek()] > input[i]) {
                    slateIndex.pop();
                } else {
                    prevMinIndex[i] = slateIndex.peek();
                    break;
                }
            }
            slateIndex.push(i);
        }

        int[] output = new int[input.length];
        for (int i=0; i < input.length; i++) {
            if (nextMinIndex[i] == -1 && prevMinIndex[i] == -1) {
                continue;
            }

            if (nextMinIndex[i] == -1) {
                output[i] = prevMinIndex[i];
            } else if (prevMinIndex[i] == -1) {
                output[i] = nextMinIndex[i];
            } else if (nextMinIndex[i] - i < prevMinIndex[i] - i) {
                output[i] = nextMinIndex[i];
            } else {
                output[i] = prevMinIndex[i];
            }
        }

        return output;
    }
}
