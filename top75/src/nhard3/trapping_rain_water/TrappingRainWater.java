package nhard3.trapping_rain_water;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left=0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[right];

        int result = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                result += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                result += rightMax - height[right];
            }
        }

        return result;
    }
}
