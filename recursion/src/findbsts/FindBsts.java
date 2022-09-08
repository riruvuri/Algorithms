package findbsts;

/**
 * Time complexity: O(catalan number(n))
 * Space complexity: O(n)
 */
public class FindBsts {
    public int findBstCount(int n) {
        int[] bstCount = new int[n+1];
        bstCount[0] = 1;
        bstCount[1] = 1;
        int result = find(bstCount, n);
        return result;
    }

    private int find(int[] bstCount, int n) {
        if (bstCount[n] != 0) {
            return bstCount[n];
        }

        int result = 0;
        for (int noOfLeftNodes=0; noOfLeftNodes < n; noOfLeftNodes++) {
            int left = find(bstCount, noOfLeftNodes);
            int right = find(bstCount, n - noOfLeftNodes - 1);
            result += (left * right);
        }
        bstCount[n] = result;

        return result;
    }
}
