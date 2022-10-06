package easy15.ransom_note;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0) {
            return true;
        }
        if (magazine == null || magazine.length() == 0 || magazine.length() < ransomNote.length()) {
            return false;
        }
        char[] magArray = magazine.toCharArray();
        int[] charCount = new int[26];

        for (char c : magArray) {
            charCount[c - 'a']++;
        }

        for (char c: ransomNote.toCharArray()) {
            if (charCount[c-'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }
        return true;
    }
}
