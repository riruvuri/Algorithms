package hanoi;

import org.junit.Test;

public class TowersOfHanoiTest {

    @Test
    public void test_simple() {

        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.towersOfHanoi(3);
    }
}
