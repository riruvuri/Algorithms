package medium.random_pick;

import org.junit.Assert;
import org.junit.Test;

public class RandomPickTest {
    @Test
    public void simple_test() {
        int[] input = {1,3};
        RandomPick randomPick = new RandomPick(input);

        int[] occurenceCount = new int[input.length];
        int sampleTest = 20;
        for (int i=0; i < sampleTest; i++) {
            occurenceCount[randomPick.pickIndex()]++;
        }
        Assert.assertTrue((occurenceCount[1] * 1.0)/20 >= 0.7);
    }

    @Test
    public void simple_test_alt() {
        int[] input = {1,2, 3, 4, 3};
        RandomPick randomPick = new RandomPick(input);

        int[] occurenceCount = new int[input.length];
        int sampleTest = 10;
        for (int i=0; i < sampleTest; i++) {
            occurenceCount[randomPick.pickIndex()]++;
        }
        Assert.assertTrue(occurenceCount[4] <= occurenceCount[3]);
    }
}
