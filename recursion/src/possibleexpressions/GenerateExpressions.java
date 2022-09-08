package possibleexpressions;

import java.util.ArrayList;
import java.util.List;

public class GenerateExpressions {

    public List<String> generateExpressions(String input, long target) {
        List<String> outputList = new ArrayList<>();
        char[] slate = new char[input.length() * 2];
        char[] inputDigits = input.toCharArray();
        long currentValue = 0;

        for (int i=0;i < inputDigits.length; i++) {
            currentValue = 10 * currentValue + (inputDigits[i] - '0');
            slate[i] = inputDigits[i];

            helper(inputDigits, slate, outputList, i+1, i+1, 0, currentValue, target);
        }


        return outputList;
    }

    private void helper(char[] inputDigits, char[] slate, List<String> outputList, int start, int slateIndex, long previous, long currentValue, long target) {
        if (start == inputDigits.length) {
            if (currentValue + previous ==  target) {
                outputList.add(new String(slate, 0, slateIndex));
            }
            return;
        }

        long n = 0;
        int j = slateIndex + 1;
        for (int i = start; i < inputDigits.length; i++) {
            n = n * 10 +(inputDigits[i] - '0');

            slate[j++] = inputDigits[i];
            slate[slateIndex] = '*';
            helper(inputDigits, slate, outputList, i+1, j, previous, currentValue * n, target);

            slate[slateIndex] = '+';
            helper(inputDigits, slate, outputList, i+1, j, previous + currentValue, n, target);
        }
    }
}
