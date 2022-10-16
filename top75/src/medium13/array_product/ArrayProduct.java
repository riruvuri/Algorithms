package medium13.array_product;

public class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        /*
        int[] leftProdArr = new int[nums.length];
        int[] rightProdArr = new int[nums.length];

        int productFromLeft = 1;
        leftProdArr[0] = 1;
        for (int i=1; i < leftProdArr.length; i++) {
            productFromLeft *= nums[i-1];

            leftProdArr[i] = productFromLeft;
        }

        int productFromRight = 1;
        rightProdArr[nums.length - 1] = 1;
        for (int i=rightProdArr.length - 2; i >= 0; i--) {
            productFromRight *= nums[i+1];

            rightProdArr[i] = productFromRight;
        }

        int[] output = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            output[i] = leftProdArr[i] * rightProdArr[i];
        } */


        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i=1; i < nums.length; i++) {
            output[i] = output[i-1] * nums[i-1];
        }
        int temp = 1;
        for (int i=nums.length - 2; i >= 0; i--) {
            output[i] = output[i] * (nums[i+1] * temp);
            temp = nums[i+1] * temp;
        }

        return output;
    }
}
