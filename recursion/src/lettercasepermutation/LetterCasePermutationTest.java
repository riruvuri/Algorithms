package lettercasepermutation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCasePermutationTest {

    @Test
    public void test_simple() {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        List<String> actualList = letterCasePermutation.findPermutations("a1b2");
        List<String> expectedList = Arrays.asList("a1b2","a1B2", "A1b2", "A1B2");
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void test_simple_numeric() {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        List<String> actualList = letterCasePermutation.findPermutations("12345");
        List<String> expectedList = Arrays.asList("12345");
        Assert.assertEquals(expectedList, actualList);
    }
}
