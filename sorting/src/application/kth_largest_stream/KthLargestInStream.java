package application.kth_largest_stream;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Given an initial list along with another list of numbers to be appended with the initial list
 * and an integer k, return an array consisting of the k-th largest element after adding each element
 * from the first list to the second list.
 *
 * {
 * "k": 2,
 * "initial_stream": [4, 6],
 * "append_stream": [5, 2, 20]
 * }
 *
 * Output: [5, 5, 6]
 */
public class KthLargestInStream {
    public List<Integer> findKthLargest(Integer k, List<Integer> initialStream, List<Integer> appendStream) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (Integer i : initialStream) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<Integer> outputList = new ArrayList<>();
        for (Integer i : appendStream) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
            outputList.add(queue.peek());
        }

        return outputList;
    }
}
