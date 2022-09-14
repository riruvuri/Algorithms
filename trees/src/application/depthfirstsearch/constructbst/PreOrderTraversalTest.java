package application.depthfirstsearch.constructbst;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PreOrderTraversalTest {

    @Test
    public void test_sample() {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.createBst(new ArrayList<>(Arrays.asList(1,0,2)));
    }

    @Test
    public void test_sample_alt() {
        PreOrderTraversalAlt preOrderTraversal = new PreOrderTraversalAlt();
        preOrderTraversal.createBst(new ArrayList<>(Arrays.asList(1,0,2)));
    }

    //2, 0, 1, 3, 5, 4
    @Test
    public void test_sample_alt_1() {
        PreOrderTraversalAlt preOrderTraversal = new PreOrderTraversalAlt();
        preOrderTraversal.createBst(new ArrayList<>(Arrays.asList(2, 0, 1, 3, 5, 4)));
    }
}
