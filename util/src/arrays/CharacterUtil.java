package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class CharacterUtil {
    public static String getString(Stack<Character> input) {
        String str = input.stream().map(String::valueOf).collect(Collectors.joining());

        return str;
    }
}
