package subsets;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubSetTest {

    @Test
    public void test_simple() {
        SubSet subSet = new SubSet();
        List<List<Integer>> outputList = subSet.printSubSets(Arrays.asList(1,2,3));
    }
}
