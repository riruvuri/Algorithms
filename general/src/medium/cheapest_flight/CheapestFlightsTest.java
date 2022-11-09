package medium.cheapest_flight;

import org.junit.Assert;
import org.junit.Test;

public class CheapestFlightsTest {
    @Test
    public void simple_test() {
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        CheapestFlight cheapestFlight = new CheapestFlight();
        int minCost = cheapestFlight.findCheapestPrice(4, flights, 0, 3, 1);
        Assert.assertTrue(minCost == 700);
    }

    @Test
    public void simple_test_alt() {
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        CheapestFlight cheapestFlight = new CheapestFlight();
        int minCost = cheapestFlight.findCheapestPrice(3, flights, 0, 2, 1);
        Assert.assertTrue(minCost == 200);
    }
}
