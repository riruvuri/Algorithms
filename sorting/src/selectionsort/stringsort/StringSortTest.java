package selectionsort.stringsort;

import org.junit.Assert;
import org.junit.Test;

public class StringSortTest {

    @Test
    public void test_simplesort() {
        String input = "sortexample";
        String sortedOutput = StringSort.sort(input);
        Assert.assertTrue(sortedOutput.equals("aeelmoprstx"));
    }
}
