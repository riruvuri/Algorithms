package graph.bipartite;

import graph.coursecompletion.CourseCompletion;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BipartiteTest {


    @Test
    public void test_simple() {
        Bipartite bipartite = new Bipartite();
        boolean result = bipartite.isBipartite(5,
                Arrays.asList(0, 1, 1, 2, 3),
                Arrays.asList(2, 2, 4, 3, 4));

        Assert.assertEquals(true, result);
    }
}
