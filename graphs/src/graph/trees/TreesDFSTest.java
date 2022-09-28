package graph.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TreesDFSTest {

    @Test
    public void sample_test_cross_edge() {
        TreesDFS_NotWorking trees = new TreesDFS_NotWorking();

        boolean isTree = trees.isItATree(4, Arrays.asList(0,0,1,2), Arrays.asList(3,1,2,0));
        Assert.assertEquals(false, isTree);
    }
}
