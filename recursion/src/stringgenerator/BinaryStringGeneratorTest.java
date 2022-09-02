package stringgenerator;

import org.junit.Test;

public class BinaryStringGeneratorTest {

    @Test
    public void test_binary_generator() {
        BinaryStringGenerator binaryStringGenerator = new BinaryStringGenerator();
        binaryStringGenerator.generateBinaryString(3);
    }
}
