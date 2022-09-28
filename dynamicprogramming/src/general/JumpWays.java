package general;

/**
 * There is a one-dimensional axis. In one turn, you can take a jump
 * of length 1 or 2. Find the total number of distinct ways using
 * which you can reach from 0th coordinate to n-th coordinate?
 */
public class JumpWays {

    static Long jumpWays(Integer n) {
        long[] jumpWays = new long[3];
        jumpWays[1] = 1;
        jumpWays[2] = 2;

        for (int i=3; i <=n; i++) {
            jumpWays[i%3] = jumpWays[(i-1)%3] + jumpWays[(i-2)%3];
        }

        return jumpWays[n%3];
    }
}
