package easy7.anagram;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    @Test
    public void simple_test() {
        Anagram anagram = new Anagram();
        boolean isValid = anagram.isValid("anagram", "nagaram");

        Assert.assertTrue(isValid);
    }
}
