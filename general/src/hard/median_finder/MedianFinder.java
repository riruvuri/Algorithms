package hard.median_finder;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * LC: 295
 * https://www.youtube.com/watch?v=JNKdfHmnMSg
 */
public class MedianFinder {
    /*
     * By default, priority returns the min element. In order, to find the median we distribute the elements equally across
     * two different heaps. The order that is returned by one of the heap must be reverse to calculate the median easily.
     */
    // Store the lower half of the elements
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void addNum(int num) {
        if (maxHeap.isEmpty() || num < maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        // Make sure to balance the heaps
        if (maxHeap.size() < minHeap.size() + 1) {
            maxHeap.offer(minHeap.poll());
        } else if (minHeap.size() < maxHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        int total = minHeap.size() + maxHeap.size();
        if (total % 2 == 0) {
            return (maxHeap.peek() + minHeap.peek())/ 2.0;
        }

        return maxHeap.peek();
    }

}
