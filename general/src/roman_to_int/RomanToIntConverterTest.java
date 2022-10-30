package roman_to_int;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntConverterTest {
    @Test
    public void simple_test() {
        RomanToIntConverter romanToIntConverter = new RomanToIntConverter();
        int result = romanToIntConverter.romanToInt("MCMXCIV");

        Assert.assertTrue(result == 1994);
    }

    @Test
    public void simple_test_alt() {
        RomanToIntConverter romanToIntConverter = new RomanToIntConverter();
        int result = romanToIntConverter.romanToInt("LVIII");

        Assert.assertTrue(result == 58);
    }

    @Test
    public void simple_test_alt1() {
        RomanToIntConverter romanToIntConverter = new RomanToIntConverter();
        int result = romanToIntConverter.romanToInt("III");

        Assert.assertTrue(result == 3);
    }
}
