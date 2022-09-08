package palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class PalindromeInString {


    public List<String> findAllPalindromeInString(String inputStr) {
        List<String> outputList = new ArrayList<String>();
        Stack<String> slate = new Stack<>();

        helper(inputStr.toCharArray(), slate, outputList, 0);
        return outputList;
    }

    private void helper(char[] input, Stack<String> slate,
                        List<String> outputList, int currentIndex) {
        if (currentIndex >= input.length) {
            // Write the slate to output
            String outputStr = slate.stream().collect(Collectors.joining());
            String lastStr = this.lastStringAfterSeparator(outputStr);
            if (isPalindrome(lastStr)) {
                outputList.add(outputStr);
            }

            return;
        }

        slate.push(Character.toString(input[currentIndex]));
        helper(input, slate, outputList, currentIndex + 1);
        slate.pop();

        String outputStr = slate.stream().collect(Collectors.joining());
        String lastStr = this.lastStringAfterSeparator(outputStr);
        if (lastStr.length() > 0 && isPalindrome(lastStr)) {
            slate.push("|");
            slate.push(Character.toString(input[currentIndex]));
            helper(input, slate, outputList, currentIndex + 1);
            slate.pop();
            slate.pop();
        } else {
            return;
        }
    }

    private String lastStringAfterSeparator(String outputStr) {
        int lastSeparator = outputStr.lastIndexOf('|');
        if (lastSeparator != -1) {
            outputStr = outputStr.substring(lastSeparator+1);
        } else {
            outputStr = outputStr;
        }
        return outputStr;
    }

    private boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        char[] inputCArr = str.toCharArray();
        while (start < end) {
            if (inputCArr[start] !=  inputCArr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
