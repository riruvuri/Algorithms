package medium.ship_packages;

import org.junit.Assert;
import org.junit.Test;

public class ShipPackagesTest {
    @Test
    public void simple_test() {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        ShipPackages shipPackages = new ShipPackages();
        int minimumCapacity = shipPackages.shipWithinDays(weights, 5);

        Assert.assertTrue(minimumCapacity == 15);
    }

    @Test
    public void simple_alt() {
        int[] weights = {3,2,2,4,1,4};
        ShipPackages shipPackages = new ShipPackages();
        int minimumCapacity = shipPackages.shipWithinDays(weights, 3);

        Assert.assertTrue(minimumCapacity == 6);
    }

    @Test
    public void simple_alt1() {
        int[] weights = {1,2,3,1,1};
        ShipPackages shipPackages = new ShipPackages();
        int minimumCapacity = shipPackages.shipWithinDays(weights, 4);

        Assert.assertTrue(minimumCapacity == 3);
    }

}
