package easy5.palindrome;

public class Palindrome {
    public boolean isValid(String str) {
        char[] inputArr = str.toLowerCase().toCharArray();
        int i = 0;
        int j = inputArr.length - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (!((inputArr[i] >= 'a' && inputArr[i] <= 'z')
                    || (inputArr[i] >= '0' && inputArr[i] <= '9'))) {
                i++;
                continue;
            }

            if (!((inputArr[j] >= 'a' && inputArr[j] <= 'z')
                    || (inputArr[j] >= '0' && inputArr[j] <= '9'))) {
                j--;
                continue;
            }

            if (inputArr[i] != inputArr[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}
