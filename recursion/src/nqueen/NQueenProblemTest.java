package nqueen;

import org.junit.Test;

public class NQueenProblemTest {

    @Test
    public void simple_test() {
        NQueenProblem nQueenPlacer = new NQueenProblem();
        nQueenPlacer.findAllArrangements(8);
    }
}


