package group_videos;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GroupVideosTest {
    @Test
    public void simple_test() {
        Map<String, List<String>> inputMap = new HashMap<>();
        inputMap.put("video1", Arrays.asList("food", "sport"));
        inputMap.put("video2", Arrays.asList("travel"));
        inputMap.put("video3", Arrays.asList("sport"));

        GroupVideos groupVideos = new GroupVideos();
        List<Set<String>> result = groupVideos.listGroupByCategory(inputMap);
        List<Set<String>> expectedResult = Arrays.asList(new HashSet<>(Arrays.asList("video1", "video3")),
                                                         new HashSet<>(Arrays.asList("video2")));
        Assert.assertTrue(expectedResult.equals(result));
    }
}
