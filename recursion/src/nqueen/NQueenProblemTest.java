package nqueen;

import org.junit.Test;

import java.util.ArrayList;

public class NQueenProblemTest {

    @Test
    public void simple_test() {
        NQueenProblem nQueenPlacer = new NQueenProblem();
        ArrayList<ArrayList<String>> result = nQueenPlacer.findAllArrangements(4);
        System.out.println(result);
    }
}


