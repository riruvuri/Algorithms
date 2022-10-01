package easy5.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void simple_test() {
        Palindrome palindrome = new Palindrome();
        boolean isValid = palindrome.isValid("A man, a plan, a canal: Panama");
        Assert.assertTrue(isValid);
    }
}
