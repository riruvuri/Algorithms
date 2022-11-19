package hard.longest_parenthesis;

public class LongestParenthesisAlt {
    public int findLongestParenthesis(String input) {
        int openCount = 0, closedCount = 0;
        int maxLength = 0;
        for (int i=0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                openCount++;
                continue;
            }
            closedCount++;

            if (openCount == closedCount) {
                maxLength = Math.max(maxLength, openCount * 2);
            } else {
                if (closedCount > openCount) {
                    openCount = closedCount = 0;
                }
            }
        }

        openCount = closedCount = 0;
        for (int i= input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ')') {
                openCount++;
                continue;
            }
            closedCount++;

            if (openCount == closedCount) {
                maxLength = Math.max(maxLength, openCount * 2);
            } else {
                if (openCount > closedCount) {
                    openCount = closedCount = 0;
                }
            }
        }

        return maxLength;
    }
}
