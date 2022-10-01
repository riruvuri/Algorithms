package easy7.anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isValid(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        countChars(map1, str1);
        countChars(map2, str2);

        if (map1.size() != map2.size()) {
            return false;
        }
        for (Character c : map1.keySet()) {
            if (!map2.containsKey(c)
                    || map1.get(c) != map2.get(c)) {
                return false;
            }
        }

        return true;
    }

    private void countChars(Map<Character, Integer> map, String str) {
        char[] inputArray = str.toCharArray();
        for (char c : inputArray) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
    }
}
