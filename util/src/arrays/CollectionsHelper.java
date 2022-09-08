package arrays;

import java.util.Stack;
import java.util.stream.Collectors;

public class CollectionsHelper {

    public static int getSum(Stack<Integer> input) {
        //input.stream().reduce(0, (a, b) -> a + b);
        return input.stream().collect(Collectors.summingInt(Integer::intValue));
    }

}
