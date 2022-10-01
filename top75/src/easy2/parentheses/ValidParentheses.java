package easy2.parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String str) {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('}', '{');
        charMap.put(')', '(');
        charMap.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty() || stack.pop() != charMap.get(c)) {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
