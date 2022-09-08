package hanoi;

import java.util.*;

class TowersOfHanoiAlt {
    public static void main(String[] args) {
        TowersOfHanoiAlt towersOfHanoiAlt = new TowersOfHanoiAlt();
        List<List<String>> outputList = towersOfHanoiAlt.getAllMoves(3);
    }
    public List<List<String>> getAllMoves(int n) {
        List<List<String>> outputList = new ArrayList<>();

        helper(n, outputList, "Source", "Aux", "Destination");
        return outputList;
    }

    void helper(int n, List<List<String>> outputList, String source, String aux, String destination) {
        if (n == 1) {
            // print the move
            outputList.add(Arrays.asList(source, destination));
            return;
        }

        helper(n-1, outputList, source, destination, aux);
        helper(1, outputList, source, aux, destination);
        helper(n-1, outputList, aux, source, destination);
    }
}