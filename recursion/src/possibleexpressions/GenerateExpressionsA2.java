package possibleexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class GenerateExpressionsA2 {
    public List<String> generateExpressions(String input, int target) {
        List<String> outputList = new ArrayList<>();
        Stack<String> slate = new Stack<>();
        int currentIndex = 0;
        int currentValue = 0;
        helper(input.toCharArray(), currentIndex, slate, outputList, currentValue, Character.getNumericValue(input.charAt(0)), target);

        return outputList;
    }

    private void helper(char[] inputArray, int currentIndex, Stack<String> slate,
                            List<String> outputList, int currentValue, int previous, int target) {

        if (currentIndex == inputArray.length) {
            // Match the sum
            if (previous + currentValue == target) {
                outputList.add(slate.stream().collect(Collectors.joining()));
            }
            return;
        }

        // join
        slate.push(Character.toString(inputArray[currentIndex]));
        currentValue = 10 * currentValue + Character.getNumericValue(inputArray[currentIndex]);
        helper(inputArray, currentIndex+1, slate, outputList, currentValue, currentValue, target);
        slate.pop();

        if (!slate.isEmpty()) {
            slate.push("*");
            slate.push(Character.toString(inputArray[currentIndex]));
            helper(inputArray, currentIndex + 1, slate, outputList,
                    previous * Character.getNumericValue(inputArray[currentIndex]),
                    previous, target);
            slate.pop();
            slate.pop();

            // addition
            slate.push("+");
            slate.push(Character.toString(inputArray[currentIndex]));
            helper(inputArray, currentIndex + 1, slate, outputList,
                        previous + Character.getNumericValue(inputArray[currentIndex]),
                            previous, target);
            slate.pop();
            slate.pop();
        }
    }
}
