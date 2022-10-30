package hard.text_justification;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TextJustificationTest {
    @Test
    public void simple_test() {
        String[] inputStrs = {"What","must","be","acknowledgment","shall","be"};
        TextJustification textJustification = new TextJustification();
        List<String> result = textJustification.fullJustify(inputStrs, 16);

        List<String> expected = Arrays.asList(new String[]{"What   must   be", "acknowledgment  ", "shall be        "});

        Assert.assertEquals(expected, result);
    }

    @Test
    public void simple_test_alt() {
        String[] inputStrs = {"Science","is","what","we","understand","well","enough","to",
                                    "explain","to","a","computer.","Art","is",
                                    "everything","else","we","do"};
        TextJustification textJustification = new TextJustification();
        List<String> result = textJustification.fullJustify(inputStrs, 20);

        List<String> expected = Arrays.asList(new String[]{"Science  is  what we",
                                                            "understand      well",
                                                            "enough to explain to",
                                                            "a  computer.  Art is",
                                                            "everything  else  we",
                                                            "do                  "});

        Assert.assertEquals(expected, result);
    }

    @Test
    public void simple_test_alt1() {
        String[] inputStrs = {"This", "is", "an", "example", "of", "text", "justification."};
        TextJustification textJustification = new TextJustification();
        List<String> result = textJustification.fullJustify(inputStrs, 16);

        List<String> expected = Arrays.asList(new String[]{"This    is    an",
                                                            "example  of text",
                                                            "justification.  "});

        Assert.assertEquals(expected, result);
    }
}
