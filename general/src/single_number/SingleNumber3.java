package single_number;

public class SingleNumber3 {
    public int[] findTwoNumbers(int[] nums) {
        int result = 0;

        // Take XOR of all the elements
        for (int i : nums) {
            result ^= i;
        }

        // Find bit mask
        int mask = result & (-result);

        // Divide the input array into two groups and then take XOR
        int groupA = 0;
        int groupB = 0;
        for (int num : nums) {
            if ((mask & num) == 0 ) {
                groupA ^= num;
            } else {
                groupB ^= num;
            }
        }

        return new int[]{groupA, groupB};
    }
}
