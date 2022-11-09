package medium.k_closest;

import org.junit.Test;

public class ClosestElementsTest {
    @Test
    public void simple_test() {
        ClosestElements closestElements = new ClosestElements();
        closestElements.findClosestElements(new int[]{1,2,3,4,5}, 4, -1);
    }
}
