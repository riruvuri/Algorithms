package medium.random_pick;

/**
 * LC: 528
 * https://leetcode.com/problems/random-pick-with-weight/solutions/617357/random-pick-with-weight/
 *
 */
public class RandomPick {
    int totalWeight = 0;
    int[] weights = null;
    public RandomPick(int[] w) {
        this.weights = new int[w.length];

        int prefixSum = 0;
        for (int i = 0; i < w.length; ++i) {
            prefixSum += w[i];
            this.weights[i] = prefixSum;
        }
        totalWeight = prefixSum;
    }

    public int pickIndex() {
        double target = totalWeight * Math.random();
        System.out.println(target);
        int l = 0;
        int r = weights.length;
        while (l < r) {
            int mid = l + (r-l)/2;
            if (target > weights[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}
