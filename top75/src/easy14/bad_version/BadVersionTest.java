package easy14.bad_version;

import org.junit.Assert;
import org.junit.Test;

public class BadVersionTest {
    @Test
    public void simple_test() {
        BadVersion badVersion = new BadVersion();
        int firstBadVersion = badVersion.firstBadVersion(10, 4);

        Assert.assertTrue(firstBadVersion == 4);
    }

    @Test
    public void simple_test_alt() {
        BadVersion badVersion = new BadVersion();
        int firstBadVersion = badVersion.firstBadVersion(1, 1);

        Assert.assertTrue(firstBadVersion == 1);
    }
}
