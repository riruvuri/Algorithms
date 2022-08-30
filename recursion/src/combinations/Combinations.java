package combinations;

import java.util.ArrayList;

public class Combinations {

    public static void main(String[] args) {
        Combinations.find_combinations(5, 2);
    }

    static ArrayList<ArrayList<Integer>> find_combinations(Integer n, Integer k) {

        ArrayList<Integer> slate = new  ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> results = new  ArrayList<ArrayList<Integer>>();

        nChooseK(1, n, k, slate, results);
        return results;
    }

    public static void nChooseK(int current, int n, int k, ArrayList<Integer> slate, ArrayList<ArrayList<Integer>> results) {

        if (k == slate.size()) {
            results.add(new ArrayList<Integer>(slate));
            return;
        }

        if (current == n+1) {
            return;
        }

        nChooseK(current+1,n,k,slate,results);

        slate.add(current);
        nChooseK(current+1,n,k,slate,results);
        slate.remove(slate.size()-1);
    }

}
