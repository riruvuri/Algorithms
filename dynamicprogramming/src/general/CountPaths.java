package general;

public class CountPaths {

    static Integer unique_paths(Integer n, Integer m) {
        int[][] matrix = new int[n][m];

        for (int j=0; j < matrix[0].length; j++) {
            matrix[0][j] = 1;
        }

        for (int i=0; i < matrix.length; i++) {
            matrix[i][0] = 1;
        }

        for (int i=1; i < matrix.length; i++) {
            for (int j=1; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }

        return matrix[n-1][m-1];
    }

}
