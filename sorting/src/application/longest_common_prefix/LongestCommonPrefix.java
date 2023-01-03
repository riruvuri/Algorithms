package application.longest_common_prefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        String prefix = words[0];
        if (words.length == 1) {
            return prefix;
        }

        for (int i=1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
