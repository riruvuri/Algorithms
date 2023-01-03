package application.longest_common_prefix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class LongestCommonPrefixBS {
    public String longestCommonPrefix(String[] words) {
        // Find the min length
        OptionalInt optionalInt = Arrays.stream(words).mapToInt(String::length).min();
        int minLength = optionalInt.getAsInt();
        int low = 0;
        int high = minLength;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (isCommonPrefix(words, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return words[0].substring(0, (low+high)/2);
    }

    private boolean isCommonPrefix(String[] words, int mid) {
        String refStr = words[0].substring(0, mid);
        for (int i=1; i < words.length; i++) {
            if (!words[i].startsWith(refStr)) {
                return false;
            }
        }

        return true;
    }
}
