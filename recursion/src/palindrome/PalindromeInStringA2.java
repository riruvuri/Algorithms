package palindrome;

import java.util.ArrayList;
import java.util.List;

/**
 * A2 - Approach 2
 */
public class PalindromeInStringA2 {
    public List<String> findAllPalindromeInString(String inputStr) {
        List<String> outputList = new ArrayList<String>();
        char[] slate = new char[inputStr.length() * 2];

        helper(inputStr.toCharArray(), 0, slate, outputList, 0);
        return outputList;
    }

    private void helper(char[] inputArray, int slatePointer, char[] slate, List<String> outputList, int currentIndex) {
        if (currentIndex >= inputArray.length) {
            outputList.add(new String(slate, 0, slatePointer-1));
            return;
        }

        for (int i=currentIndex; i < inputArray.length; i++) {
            slate[slatePointer++] = inputArray[i];

            if(isPalindrome(inputArray, currentIndex, i)) {
                slate[slatePointer] = '|';

                helper(inputArray, slatePointer + 1, slate, outputList, i+1);
            }
        }
    }

    private boolean isPalindrome(char[] input, int left, int right) {
        while(left <= right) {
            if (input[left++] != input[right--]) {
                return false;
            }
        }
        return true;
    }
}
