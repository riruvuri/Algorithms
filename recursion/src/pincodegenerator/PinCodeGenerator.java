package pincodegenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*
Write a program that generates all 4 digit pin codes
 */
public class PinCodeGenerator {
    public List<String> generatePinCodes(int n) {
        List<String> pinCodes = new ArrayList<>();
        Stack<Integer> slate = new Stack<>();
        pinCodeHelper(n, slate, pinCodes);

        return pinCodes;
    }

    private void pinCodeHelper(int n, Stack<Integer> slate, List<String> pinCodes) {
        if (n == 0) {
            pinCodes.add(slate.stream().map(String::valueOf).collect(Collectors.joining("","","")));
            return;
        }

        for (int i = 0; i < 10; i++) {
            slate.push(i);
            pinCodeHelper(n-1, slate, pinCodes);
            slate.pop();
        }
    }
}
