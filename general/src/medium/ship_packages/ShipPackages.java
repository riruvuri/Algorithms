package medium.ship_packages;

/**
 * LC: 1011
 * The least weight that is possible to ship is the max weight of the packages. The max weight that is possible
 * is the overall weight of all the packages. Least weight cannot be less than (overall weight/days), this helps
 * in the case of lot of small packages.
 *
 * The approach is to start with the max. weight of the package and increment capacity till we hit the target
 * number of days.
 *
 * Here, the increase in the capacity always decrease the days, the function that is possible here is:
 * d = f(capacity), which is monotonic. For monotonic function, we can apply Binary search to speed up the process
 * instead of increment one-by-one.
 *
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/solutions/256737/c-binary-search/
 *
 * Time complexity: O( n log n)
 * Space complexity: O(1)
 */
public class ShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int overallWeight = 0;

        for (int weight : weights) {
            overallWeight += weight;
            maxWeight = Math.max(maxWeight, weight);
        }

        int lower = Math.max(maxWeight, overallWeight/days);
        int upper = overallWeight;

        while (lower < upper) {
            int shipCapacity = lower + (upper - lower)/2;
            int minDays = countDays(weights, shipCapacity);
            if (minDays <= days) {
                upper = shipCapacity;
            } else {
                lower = shipCapacity + 1;
            }

        }
        return lower;
    }

    private int countDays(int[] weights, int capacity) {
        int shipDays = 1, currentCapacity = 0;
        for (int weight : weights) {
            currentCapacity += weight;
            if (currentCapacity > capacity) {
                currentCapacity = weight;
                shipDays++;
            }
        }

        return shipDays;
    }

}
