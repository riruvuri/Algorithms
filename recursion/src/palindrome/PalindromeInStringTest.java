package palindrome;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PalindromeInStringTest {

    @Test
    public void test_simple() {
        PalindromeInString palindromeInString = new PalindromeInString();
        List<String> outputList = palindromeInString.findAllPalindromeInString("aaba");

        List<String> expectedList = Arrays.asList("aa|b|a", "a|aba",
                                                    "a|a|b|a");

        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }

    @Test
    public void test_simple_magic() {
        PalindromeInString palindromeInString = new PalindromeInString();
        List<String> outputList = palindromeInString.findAllPalindromeInString("abracadabra");

        List<String> expectedList = Arrays.asList("a|b|r|aca|d|a|b|r|a", "a|b|r|a|c|ada|b|r|a",
                                                    "a|b|r|a|c|a|d|a|b|r|a");

        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }

    @Test
    public void test_simple_a2() {
        PalindromeInStringA2 palindromeInString = new PalindromeInStringA2();
        List<String> outputList = palindromeInString.findAllPalindromeInString("aaba");

        List<String> expectedList = Arrays.asList("aa|b|a", "a|aba",
                "a|a|b|a");

        Assert.assertTrue(outputList.size() == expectedList.size()
                && outputList.containsAll(expectedList)
                && expectedList.containsAll(outputList));
    }
}
