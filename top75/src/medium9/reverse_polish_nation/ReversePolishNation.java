package medium9.reverse_polish_nation;

import java.util.Stack;

public class ReversePolishNation {
    public int compute(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token: tokens) {

            if (token.length() ==1
                    && !Character.isDigit(token.charAt(0))) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.add(num1 + num2);
                        break;
                    case "-":
                        stack.add(num1 - num2);
                        break;

                    case "*":
                        stack.add(num1 * num2);
                        break;

                    case "/":
                        stack.add(num1 / num2);
                        break;

                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
