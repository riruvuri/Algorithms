package hard.longest_parenthesis;

import java.util.Stack;

/**
 * LC: 32
 */
public class LongestParenthesis {
    public int findLongestParenthesis(String input) {
        Stack<Integer> stack = new Stack<>();
        /*
        Why do we start with -1 ?
         Array indexes start from zero, to find the length of the string, we need to add '1'. Instead of
         adding '1', we store '-1' and this works out as addition of '1' to the length of the string.
         */
        stack.push(-1);

        int maxLength = 0;
        for (int i= 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                stack.push(i);
                continue;
            }

            stack.pop();
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                maxLength = Math.max(maxLength, i - stack.peek());
            }
        }
        return maxLength;
    }
}
