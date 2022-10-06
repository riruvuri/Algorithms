package easy17.longest_palindrome;

public class LongestPalindrome {

    public int longestPalindrome(String str) {
        char[] inputChars = str.toCharArray();
        int[] charCount = new int[52];
        for (int i=0; i < inputChars.length; i++) {
            if (inputChars[i] >= 'a' && inputChars[i] <= 'z') {
                charCount[inputChars[i] - 'a']++;
            } else {
                charCount[inputChars[i] - 'A' + 26]++;
            }
        }

        int count = 0;
        for (int i=0; i < charCount.length; i++) {
            count += charCount[i] / 2;
        }

        count *= 2;

        return Math.min(str.length(), count + 1);
    }
}
