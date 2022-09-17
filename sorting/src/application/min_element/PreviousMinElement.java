package application.min_element;

import java.util.Stack;

public class PreviousMinElement {
    public int[] findPreviousMinElement(int[] input) {
        Stack<Integer> slate = new Stack<>();
        int[] output = new int[input.length];
        for (int i=0; i < input.length; i++) {
            while (!slate.isEmpty()) {
                int lastElement = slate.peek();

                if (lastElement > input[i]) {
                    slate.pop();
                } else {
                    output[i] = lastElement;
                    break;
                }
            }

            slate.push(input[i]);
        }

        return output;
    }

}
