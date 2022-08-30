package lettercasepermutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class LetterCasePermutation {

    public List<String> findPermutations(String input) {
        List<String> outputList = new ArrayList<>();
        Stack<Character> slate = new Stack<>();

        findPermutation(0, slate, input.toCharArray(), outputList);
        return outputList;
    }

    private void findPermutation(int currentCharIndex, Stack<Character> slate, char[] input, List<String> outputList) {
        // Base case
        if (slate.size() == input.length) {
            String outputStr = slate.stream().map(String::valueOf).collect(Collectors.joining());
            outputList.add(outputStr);
            return;
        }

        // Recursive
        Character currentChar = input[currentCharIndex];
        if (Character.isLetter(currentChar)) {
            slate.push(currentChar);
            findPermutation(currentCharIndex+1, slate, input, outputList);
            slate.pop();

            slate.push(Character.toUpperCase(currentChar));
            findPermutation(currentCharIndex+1, slate, input, outputList);
            slate.pop();
        } else {
            slate.push(currentChar);
            findPermutation(currentCharIndex+1, slate, input, outputList);
            slate.pop();
        }
    }

}
