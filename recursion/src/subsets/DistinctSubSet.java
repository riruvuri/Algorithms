package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class DistinctSubSet {


    public ArrayList<String> getDistinctSubsets(String s) {
        char[] inputArray = s.toCharArray();
        Arrays.sort(inputArray);
        ArrayList<String> outputList = new ArrayList<>();
        Stack<String> slate = new Stack<>();
        int currentIndex = 0;
        helper(inputArray, currentIndex, slate, outputList);

        return outputList;
    }

    void helper(char[] inputArray, int currentIndex,
                       Stack<String> slate, ArrayList<String> outputList) {
        if (currentIndex >= inputArray.length) {
            outputList.add(slate.stream().collect(Collectors.joining()));
            return;
        }

        slate.push(Character.toString(inputArray[currentIndex]));
        helper(inputArray, currentIndex+1, slate, outputList);
        slate.pop();

        while(currentIndex < inputArray.length-1 && inputArray[currentIndex] == inputArray[currentIndex+1]){
            currentIndex++;
        }

        helper(inputArray, currentIndex+1, slate, outputList);
    }

}
