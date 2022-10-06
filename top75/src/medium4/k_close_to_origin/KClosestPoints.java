package medium4.k_close_to_origin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Coordinates implements Comparable<Coordinates> {
    int x;
    int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int calculateDistance(int x, int y) {
        return x * x + y * y;
    }

    @Override
    public int compareTo(Coordinates o) {
        return calculateDistance(x, y) - calculateDistance(o.x, o.y);
    }
}

public class KClosestPoints {
    public int[][] find(int[][] input, int k) {
        PriorityQueue<Coordinates> priorityQueue = new PriorityQueue<>();
        for (int i=0; i < input.length; i++) {
            int[] current = input[i];

            priorityQueue.add(new Coordinates(current[0], current[1]));
        }

        int[][] pointsCloseToOrigin = new int[k][];
        for (int i=0; i < k; i++) {
            Coordinates coordinates = priorityQueue.poll();
            pointsCloseToOrigin[i] = new int[] {coordinates.x, coordinates.y};
        }
        return pointsCloseToOrigin;
    }


}
