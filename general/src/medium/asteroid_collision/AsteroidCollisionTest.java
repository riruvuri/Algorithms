package medium.asteroid_collision;

import org.junit.Assert;
import org.junit.Test;

public class AsteroidCollisionTest {
    @Test
    public void simple_test() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] result = asteroidCollision.asteroidCollision(new int[]{5,10, -5});

        Assert.assertArrayEquals(new int[]{5,10}, result);
    }

    @Test
    public void simple_test_alt() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] result = asteroidCollision.asteroidCollision(new int[]{5,-5});

        Assert.assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void simple_test_alt1() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] result = asteroidCollision.asteroidCollision(new int[]{10,2,-5});

        Assert.assertArrayEquals(new int[]{10}, result);
    }
}
