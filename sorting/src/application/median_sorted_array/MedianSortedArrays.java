package application.median_sorted_array;

/**
 * Reference:
 * https://www.youtube.com/watch?v=LPFhl65R7ww
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/binarysearch/MedianOfTwoSortedArrayOfDifferentLength.java
 *
 * Time complexity: O(log(min(x,y))
 * Space complexity: O(1)
 */
public class MedianSortedArrays {

    public double findMedian(int[] input1, int[] input2) {
        // Since we apply binary search on the minimum length array.
        // keep the smaller size to input1 and work on input1
        if (input1.length > input2.length) {
            return findMedian(input2, input1);
        }

        int low = 0;
        int high = input1.length;
        int lengthX = input1.length;
        int lengthY = input2.length;

        while (low <= high) {
            int partitionX = (low + high)/2;
            int partitionY = (lengthX + lengthY + 1)/2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE
                                                : input1[partitionX-1];
            int minRightX = (partitionX == lengthX) ? Integer.MAX_VALUE
                                                : input1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE
                                                : input2[partitionY-1];
            int minRightY = (partitionY == lengthY) ? Integer.MAX_VALUE
                                                : input2[partitionY];


            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // This is the case of array partitions are exactly in correct position

                // The median logic is based on the total number of elements in the combined array
                if ((lengthX+lengthY) % 2 ==0) {
                    // Median is the avg. value
                    double total = Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY);
                    return total/2;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if(maxLeftX > minRightY) {
                // Left partition is placed more towards the right, start shifting left
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}
