package group_videos;

import java.util.*;

/**
 * Given the input:
 * video1 : [food, sport], video2: [travel], video3: [sport]
 *
 * Return an aggregated string by category:
 * [[video1,video3], [video2]]
 */
public class GroupVideos {
    public List<Set<String>> listGroupByCategory(Map<String, List<String>> inputMap) {
        Map<String, Integer> categoryMap = new HashMap<>();
        Map<Integer, Set<String>> inputVideosMap = new HashMap<>();
        int i=0;
        for (String video : inputMap.keySet()) {
            List<String> categoryList = inputMap.get(video);
            Integer key = null;
            for (String category : categoryList) {
                if (categoryMap.containsKey(category)) {
                    key = categoryMap.get(category);
                    break;
                } else {
                    categoryMap.put(category, i);
                }
            }

            key = (key == null) ? i : key;

            Set<String> videoSet = inputVideosMap.getOrDefault(key, new HashSet<>());
            inputVideosMap.put(key, videoSet);

            videoSet.add(video);
            i++;
        }

        return new ArrayList<>(inputVideosMap.values());
    }
}
