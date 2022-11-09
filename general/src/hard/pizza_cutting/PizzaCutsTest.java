package hard.pizza_cutting;

import org.junit.Assert;
import org.junit.Test;

public class PizzaCutsTest {

    @Test
    public void simple_test() {
        String[] input = {"A..","AAA","..."};
        PizzaCuts pizzaCuts = new PizzaCuts();
        int result = pizzaCuts.ways(input, 3);

        Assert.assertTrue(result == 3);
    }
}
