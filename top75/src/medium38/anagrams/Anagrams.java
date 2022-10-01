package medium38.anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    public List<Integer> findAnagrams(String str, String p) {
        List<Integer> resultList = new ArrayList<>();
        Map<Character, Integer> refMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            refMap.put(c, refMap.getOrDefault(c,0) + 1);
        }

        int left = 0;
        int right = 0;
        Map<Character, Integer> tempRefMap = new HashMap<>();
        int count = 0;
        while (right < str.length()) {
            char c = str.charAt(right);
            tempRefMap.put(c, tempRefMap.getOrDefault(c, 0) + 1);
            count++;

            if (count == refMap.size()) {
                if (tempRefMap.equals(refMap)) {
                    resultList.add(left);
                }
                count--;
                tempRefMap.put(str.charAt(left), tempRefMap.get(str.charAt(left)) - 1);
                if (tempRefMap.get(str.charAt(left)) == 0) {
                    tempRefMap.remove(str.charAt(left));
                }
                left++;
            }
            right++;
        }

        return resultList;
    }
}
