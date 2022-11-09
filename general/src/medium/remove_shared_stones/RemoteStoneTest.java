package medium.remove_shared_stones;

import org.junit.Assert;
import org.junit.Test;

public class RemoteStoneTest {
    @Test
    public void simple_test() {
        RemoteStone remoteStone = new RemoteStone();
        int result = remoteStone.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}});
        Assert.assertTrue(result == 5);
    }
}
