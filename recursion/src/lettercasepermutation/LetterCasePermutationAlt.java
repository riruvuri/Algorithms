package lettercasepermutation;

import java.util.*;
import java.util.stream.Collectors;

class LetterCasePermutationAlt {
    public static void main(String[] args) {
        new LetterCasePermutationAlt().getAllPermutations("a1b2");
    }

    List<String> getAllPermutations(String input) {
        char[] inputArray = input.toCharArray();
        List<String> outputList = new ArrayList<>();
        Stack<Character> slate = new Stack<>();
        int currentIndex = 0;
        helper(inputArray, outputList, slate, currentIndex);

        return outputList;
    }

    void helper(char[] inputArray, List<String> outputList, Stack<Character> slate, int currentIndex) {
        if (currentIndex == inputArray.length) {
            outputList.add(slate.stream().map(String::valueOf).collect(Collectors.joining()));
            return;
        }

        if (Character.isAlphabetic(inputArray[currentIndex])) {
            slate.push(inputArray[currentIndex]);
            helper(inputArray, outputList, slate, currentIndex+1);
            slate.pop();

            slate.push(Character.toUpperCase(inputArray[currentIndex]));
            helper(inputArray, outputList, slate, currentIndex+1);
            slate.pop();
        } else {
            slate.push(inputArray[currentIndex]);
            helper(inputArray, outputList, slate, currentIndex+1);
            slate.pop();
        }
    }
}