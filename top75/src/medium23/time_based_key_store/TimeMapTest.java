package medium23.time_based_key_store;

import org.junit.Assert;
import org.junit.Test;

public class TimeMapTest {
    @Test
    public void simple_test() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);

        String value = timeMap.get("foo", 1);
        Assert.assertTrue(value.equals("bar"));

        value = timeMap.get("foo", 3);
        Assert.assertTrue(value.equals("bar"));

        timeMap.set("foo", "bar2", 4);
        value = timeMap.get("foo", 4);
        Assert.assertTrue(value.equals("bar2"));

        value = timeMap.get("foo", 5);
        Assert.assertTrue(value.equals("bar2"));


    }
}
