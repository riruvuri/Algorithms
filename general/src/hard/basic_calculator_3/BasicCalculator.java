package hard.basic_calculator_3;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String expr) {
        if (expr == null || expr.length() == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        char[] chrArr = expr.toCharArray();
        int num = 0;
        char defaultSign = '+';
        for (int i=0; i < chrArr.length; i++) {
            char current = chrArr[i];
            if (Character.isDigit(current) ) {
                num = num * 10 + Character.getNumericValue(current);
            } else if (current == '(') {
                int braces = 1;
                int j = i+1;

                for (;j < expr.length(); j++) {
                    char c = expr.charAt(j);
                    if (c == '(') {
                        braces++;
                    } else if (c == ')') {
                        braces--;
                    }

                    if (braces == 0) {
                        break;
                    }
                }
                num = calculate(expr.substring(i+1, j));
                i = j;
            }

            if (current == '+' || current == '-' || current == '/' || current == '*' || i == expr.length() - 1) {

                switch (defaultSign) {
                    case '+' :
                        stack.push(num);
                        break;
                    case '-' :
                        stack.push(-1 * num);
                        break;
                    case '*' :
                        stack.push(stack.pop() * num);
                        break;
                    case '/' :
                        stack.push(stack.pop() / num);
                        break;
                }
                defaultSign = current;
                num = 0;
            }
        }

        int total = 0;
        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        return total;
    }
}
