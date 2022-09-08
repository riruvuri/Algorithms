package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class CharacterUtilTest {

    @Test
    public void test_stack_character_string_conversion() {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        String output = CharacterUtil.getString(stack);

        Assert.assertEquals("abc", output);
    }
}
