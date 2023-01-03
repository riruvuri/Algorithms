package application.longest_common_prefix;

public class LongestCommonPrefixDivideNConquer {
    public String longestCommonPrefix(String[] words) {
        return prefixHelper(words, 0, words.length - 1);
    }

    private String prefixHelper(String[] words, int start, int end) {
        if (start == end) {
            return words[start];
        }

        int mid = start + (end - start)/2;
        String leftString = prefixHelper(words, start, mid);
        String rightString = prefixHelper(words, mid + 1, end);

        return findCommonPrefix(leftString, rightString);
    }

    private String findCommonPrefix(String leftString, String rightString) {
        int minLength = Math.min(leftString.length(), rightString.length());

        for (int i=0; i < minLength; i++) {
            if (leftString.charAt(i) != rightString.charAt(i)) {
                return leftString.substring(0, i);
            }
        }
        return leftString.substring(0, minLength);
    }


}
