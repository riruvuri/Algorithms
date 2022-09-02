package pincodegenerator;

import org.junit.Test;

public class PinCodeGeneratorTest {

    @Test
    public void test_simple_generator() {
        PinCodeGenerator pinCodeGenerator = new PinCodeGenerator();
        pinCodeGenerator.generatePinCodes(4);
    }
}
