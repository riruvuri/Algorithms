package medium.valid_palindrome_one_miss;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        int i =0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (checkPalindrome(s, i, j-1)
                        || checkPalindrome(s, i+1, j)) {
                    return true;
                } else {
                    return false;
                }
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
