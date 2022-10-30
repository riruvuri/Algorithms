package roman_to_int;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntConverter {
    public int romanToInt(String s) {
        Map<String, Integer> values = new HashMap<>();
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);

        char[] charArr = s.toCharArray();

        int i=0;
        int previous = 0;
        int result = 0;
        while (i < charArr.length) {
            int current = values.get(Character.toString(charArr[i]));

            if (previous < current) {
                current = current - previous;
            } else {
                result += previous;
            }

            previous = current;
            i++;
        }

        result += previous;

        return result;
    }
}
