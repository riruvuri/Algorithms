package stringgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*
Generate binary strings of size 'n'
 */
public class BinaryStringGenerator {
    public List<String> generateBinaryString(int n) {
        List<String> results = new ArrayList<>();
        binaryStringHelper(n, new Stack<String>(), results);

        return results;
    }

    public void binaryStringHelper(int n, Stack<String> slate, List<String> results) {
        if (n == 0) {
            results.add(slate.stream().collect(Collectors.joining()));
            return;
        }

        slate.push("0");
        binaryStringHelper(n-1, slate, results);
        slate.pop();

        slate.push("1");
        binaryStringHelper(n-1, slate, results);
        slate.pop();
    }

}
