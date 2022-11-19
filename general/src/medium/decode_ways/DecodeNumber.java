package medium.decode_ways;

/**
 * LC: 91 - Decode Ways
 */
public class DecodeNumber {
    public int findWays(String input) {
        return decodeHelper(input, 0);
    }

    private int decodeHelper(String input, int i) {
        if (i == input.length()) {
            return 1;
        }
        if (input.charAt(i) == '0') {
            return 0;
        }

        if (input.length() - 1 == i) {
            return 1;
        }

        int decodePossibilities = 0;
        decodePossibilities += decodeHelper(input, i+1);

        if (Integer.parseInt(input.substring(i, i+2)) <= 26) {
            decodePossibilities += decodeHelper(input, i+2);
        }

        return decodePossibilities;
    }
}
