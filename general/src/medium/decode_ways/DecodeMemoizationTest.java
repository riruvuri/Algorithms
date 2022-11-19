package medium.decode_ways;

import org.junit.Assert;
import org.junit.Test;

public class DecodeMemoizationTest {
    @Test
    public void simple_test() {

        String[] input = {"12", "226", "06", "2125"};
        int[] expectedResult = {2,3,0, 5};
        int[] output = new int[input.length];

        for (int i=0; i < input.length; i++) {
            DecodeMemoization decodeNumber = new DecodeMemoization();
            output[i] = decodeNumber.findWays(input[i]);
        }

        Assert.assertArrayEquals(expectedResult, output);
    }
}
