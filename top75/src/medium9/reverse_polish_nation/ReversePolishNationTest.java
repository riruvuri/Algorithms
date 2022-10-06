package medium9.reverse_polish_nation;

import org.junit.Assert;
import org.junit.Test;

public class ReversePolishNationTest {
    @Test
    public void simple_test() {
        String[] input = {"2","1","+","3","*"};
        ReversePolishNation reversePolishNation = new ReversePolishNation();
        int result = reversePolishNation.compute(input);

        Assert.assertTrue(result == 9);
    }

    @Test
    public void simple_test_alt() {
        String[] input = {"4","13","5","/","+"};
        ReversePolishNation reversePolishNation = new ReversePolishNation();
        int result = reversePolishNation.compute(input);

        Assert.assertTrue(result == 6);
    }

    @Test
    public void simple_test_big() {
        String[] input = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        ReversePolishNation reversePolishNation = new ReversePolishNation();
        int result = reversePolishNation.compute(input);

        Assert.assertTrue(result == 22);
    }
}
