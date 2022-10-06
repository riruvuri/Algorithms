package easy15.ransom_note;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {
    @Test
    public void simple_test() {
        RansomNote ransomNote = new RansomNote();
        boolean result = ransomNote.canConstruct("aa", "aab");
        Assert.assertTrue(result);
    }
}
