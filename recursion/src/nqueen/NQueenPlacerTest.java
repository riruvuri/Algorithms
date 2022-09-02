package nqueen;

import org.junit.Test;

public class NQueenPlacerTest {

    @Test
    public void simple_test() {
        NQueenPlacer nQueenPlacer = new NQueenPlacer();
        NQueenPlacer.find_all_arrangements(4);
    }
}

