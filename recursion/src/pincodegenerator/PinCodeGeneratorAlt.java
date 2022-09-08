package pincodegenerator;
import java.util.*;
import java.util.stream.*;

class PinCodeGeneratorAlt {
    public static void main(String[] args) {
        new PinCodeGeneratorAlt().getAllPincodes(4);
    }
    public List<String> getAllPincodes(int n) {
        List<String> outputList = new ArrayList<>();
        Stack<String> slate = new Stack<>();

        helper(n, slate, outputList, 0);

        return outputList;
    }

    private void helper(int n, Stack<String> slate, List<String> outputList, int currentIndex) {
        if (currentIndex == n) {
            outputList.add(slate.stream().collect(Collectors.joining()));
            return;
        }

        for (int i=0; i <= 9; i++) {
            // swap the current element at index
            slate.push(""+i);
            helper(n, slate, outputList, currentIndex + 1);
            slate.pop();
        }
    }
}