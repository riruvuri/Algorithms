package general;

/**
 * Consider you have n distinct elements, find the number of ways
 * through which you can choose exactly r number of elements out of those.
 *
 * Tn) = O (n * k)
 * S(n) = O (n * k)
 */
public class NchooseR {
    static Integer ncr(Integer n, Integer r) {
        if (r == 0 || r == n) {
            return 1;
        }
        if (r > n) {
            return 0;
        }

        long[][] matrix = new long[n+1][r+1];
        for (int i=0; i < matrix.length; i++) {
            matrix[i][0] = 1;
        }
        for (int i=0; i < matrix[0].length; i++) {
            matrix[i][i] = 1;
        }

        for (int i=1; i < matrix.length; i++) {
            for (int j=1; j < Math.min(i,matrix[0].length); j++) {
                matrix[i][j] = (matrix[i-1][j] + matrix[i-1][j-1]) %1000000007;
            }
        }

        return Long.valueOf(matrix[n][r]).intValue();
    }
}
