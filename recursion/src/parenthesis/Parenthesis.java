package parenthesis;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * For the given integer generate all the strings with
 * well-formed parenthesis.
 *
 * Time complexity: O(b ^ h) => O(2 ^ 2n) * 2n
 * Space complexity: O(2n)
 *
 * Improved time complexity: O(catalan number)
 * Cn = 1/(n+1) * 2n c n
 *
 */
public class Parenthesis {
    public List<String> generateWellFormedParenthesis(int n) {
        List<String> outputList = new ArrayList<>();
        Stack<String> slate = new Stack<>();

        helper(n, 0, 0, slate, outputList);
        return outputList;
    }

    private void helper(int n, int openCount, int closedCount, Stack<String> slate, List<String> outputList) {
        if (slate.size() == 2*n
                && openCount == n) {
            // Write this to the output list
            outputList.add(slate.stream().collect(Collectors.joining()));
            return;
        }

        if (closedCount > openCount || openCount > n) {
            return;
        }

        slate.push("(");
        helper(n, openCount+1, closedCount, slate, outputList);
        slate.pop();

        slate.push(")");
        helper(n, openCount, closedCount + 1, slate, outputList);
        slate.pop();
    }
}
