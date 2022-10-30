package medium.croak_frogs;

/**
 * LC: 1419
https://leetcode.com/problems/minimum-number-of-frogs-croaking/solutions/586543/c-java-with-picture-simulation/
 */
public class CroakFrogs {
    public int minNumberOfFrogs(String croakOfFrogs, String findStr) {
        int[] count = new int[findStr.length()];
        int maxFrogCount = 0, currentFrogCount = 0;
        for (int i=0; i < croakOfFrogs.length(); i++) {
            char currentChar = croakOfFrogs.charAt(i);
            int index = findStr.indexOf(currentChar);

            count[index]++;

            if (index == 0) {
                currentFrogCount = currentFrogCount + 1;
                maxFrogCount = Math.max(currentFrogCount, maxFrogCount);
            } else if (index == findStr.length()-1) {
                currentFrogCount = currentFrogCount - 1;
            } else if (count[index] != count[index-1]) {
                return -1;
            }
        }

        return currentFrogCount == 0 ? maxFrogCount : -1;
    }
}
