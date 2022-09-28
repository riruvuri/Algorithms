package nqueen;

import java.util.ArrayList;

public class NQueenPlacer {


    static ArrayList<ArrayList<String>> find_all_arrangements(Integer n) {
        // initialize column sequence
        int[] cols = new int[n];
        for (int i = 0; i < n; i++) {
            cols[i] = i;
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        dfs_helper(0, cols, res);
        return res;
    }

    static void dfs_helper(int index, int[] cols, ArrayList<ArrayList<String>> res) {
        if (index == cols.length) {
            ArrayList<String> curRes = constructResStr(cols);
            res.add(curRes);
            return;
        }

        for (int i = index; i < cols.length; i++) {
            swap(cols, index, i);
            if (index == 0 || !checkIfAlignWithPrevs(index, cols)) {
                dfs_helper(index + 1, cols, res);
            }
            swap(cols, index, i);
        }
    }

    static boolean checkIfAlignWithPrevs(int index, int[] cols) {
        for (int j = index - 1; j >= 0; j--) {
            if (cols[j] == cols[index]) return true;
            if (Math.abs(cols[j] - cols[index]) == index - j) {
                return true;
            }
        }
        return false;
    }

    static ArrayList<String> constructResStr(int[] cols) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < cols.length; i++) {
            int col = cols[i];
            StringBuilder partialRes = new StringBuilder();
            for (int j = 0; j < cols.length; j++) {
                if (col == j) {
                    partialRes.append('q');
                } else {
                    partialRes.append('-');
                }
            }
            res.add(partialRes.toString());
        }
        return res;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
