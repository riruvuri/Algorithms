package medium.fix_parentheses;

import java.util.*;

/**
 * LC: 1249: Remove invalid parentheses to make a valid string
 *
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 */
public class FixParentheses {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> indexesToRemove = new HashSet<>();
        Stack<Integer> openParenthesis = new Stack<>();

        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openParenthesis.push(i);
            } else if (s.charAt(i) == ')') {
                if (openParenthesis.isEmpty()) {
                    indexesToRemove.add(i);
                } else {
                    openParenthesis.pop();
                }
            }
        }

        while(!openParenthesis.isEmpty()) {
            indexesToRemove.add(openParenthesis.pop());
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i < s.length(); i++) {
            if (!indexesToRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
