package hanoi;

import java.util.ArrayList;
import java.util.Arrays;

public class TowersOfHanoi {
    public ArrayList<ArrayList<String>> towersOfHanoi (int n) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        move(n, "S", "A", "D", result);
        return result;
    }
    private void move(int n, String source, String aux, String destination, ArrayList<ArrayList<String>> results) {
        if (n == 1) {

            System.out.println("source:" + source + " destination:" + destination);
            results.add(new ArrayList<>(Arrays.asList(source, destination)));
            return;
        }
        move(n-1, source, destination, aux, results);
        move(1, source, aux, destination, results);
        move(n-1, aux, source, destination, results);
    }
}
