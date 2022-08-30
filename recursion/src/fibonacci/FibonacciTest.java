package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test_fibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.getFibonacci(4);

        Assert.assertEquals(3, result);
    }
}
