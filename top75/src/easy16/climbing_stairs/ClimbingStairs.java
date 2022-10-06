package easy16.climbing_stairs;

public class ClimbingStairs {
    public int findNoOfWays(int n) {
        int[] totalWays = new int[3];
        totalWays[1] = 1;
        totalWays[2] = 2;

        for (int i=3 ; i <= n; i++) {
            totalWays[i%3] = totalWays[(i-1)%3] + totalWays[(i-2)%3];
        }

        return totalWays[n%3];
    }
}
