package medium.koko_bananas;

import java.util.Arrays;

/**
 * LC: 875
 *
 * https://leetcode.com/problems/koko-eating-bananas/
 *
 * https://www.youtube.com/watch?v=Sp2sRLcLND0
 *
 * Time complexity: O(n log m), n - no of piles and m - range of k left to right
 * Space complexity: O(1)
 */
public class BananaEating {
    public int minEatingSpeed(int[] piles, int h) {
        int lower =1, upper = Arrays.stream(piles).max().getAsInt();

        while (lower < upper) {
            int mid = lower + (upper-lower)/2;
            int totalHours = countHours(piles, mid);

            if (totalHours <= h) {
                upper = mid;
            } else {
                lower = mid+1;
            }
        }
        return lower;
    }

    private int countHours(int[] piles, int minEatingSpeed) {
        int totalHrs = 0;
        for (int pile : piles) {
            totalHrs += (pile/minEatingSpeed);
            if (pile % minEatingSpeed != 0) {
                totalHrs++;
            }
        }
        return totalHrs;
    }
}
