package medium13.array_product;

import org.junit.Assert;
import org.junit.Test;

public class ArrayProductTest {
    @Test
    public void simple_test() {
        ArrayProduct arrayProduct = new ArrayProduct();
        int[] result = arrayProduct.productExceptSelf(new int[]{1,2,3,4});

        Assert.assertArrayEquals(new int[]{24,12,8,6}, result);
    }

    @Test
    public void simple_test_alt() {
        ArrayProduct arrayProduct = new ArrayProduct();
        int[] result = arrayProduct.productExceptSelf(new int[]{-1,1,0,-3,3});

        Assert.assertArrayEquals(new int[]{0,0,9,0,0}, result);
    }
}
