package single_number;

public class SingleNumber {

    public int findSingleNumber(int[] nums) {
        int result = 0;

        for (int i : nums) {
            result ^= i;
        }

        return result;
    }
}
