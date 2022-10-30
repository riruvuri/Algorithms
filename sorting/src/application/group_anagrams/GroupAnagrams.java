package application.group_anagrams;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chrArray = strs[i].toCharArray();
            Arrays.sort(chrArray);

            String sortedStr = new String(chrArray);
            List<String> mappedList = null;
            if (map.containsKey(sortedStr)) {
                mappedList = map.get(sortedStr);
            } else {
                mappedList = new ArrayList<>();
                map.put(sortedStr, mappedList);
            }
            map.get(sortedStr).add(strs[i]);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            results.add(entry.getValue());
        }

        return results;
    }
}
