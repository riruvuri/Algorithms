package easy19.majority_element;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int i=0 ; i < nums.length; i++) {
            if (count == 0) {
                majorityElement= nums[i];
                count++;
            } else {
                if (majorityElement == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return majorityElement;
    }
}
