package medium.croak_frogs;

import org.junit.Assert;
import org.junit.Test;

public class CroakFrogsTest {
    @Test
    public void simple_test() {
        String searchInput = "croakcroak";
        String searchStr = "croak";

        CroakFrogs croakFrogs = new CroakFrogs();
        int minFrogCnt = croakFrogs.minNumberOfFrogs(searchInput, searchStr);
        Assert.assertTrue(minFrogCnt == 1);
    }

    @Test
    public void simple_test_dual() {
        String searchInput = "croacroakk";
        String searchStr = "croak";

        CroakFrogs croakFrogs = new CroakFrogs();
        int minFrogCnt = croakFrogs.minNumberOfFrogs(searchInput, searchStr);
        Assert.assertTrue(minFrogCnt == 2);
    }

    @Test
    public void simple_test_cut() {
        String searchInput = "croacroak";
        String searchStr = "croak";

        CroakFrogs croakFrogs = new CroakFrogs();
        int minFrogCnt = croakFrogs.minNumberOfFrogs(searchInput, searchStr);
        Assert.assertTrue(minFrogCnt == 2);
    }
}
