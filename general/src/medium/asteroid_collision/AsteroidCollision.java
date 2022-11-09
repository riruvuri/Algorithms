package medium.asteroid_collision;

import java.util.ArrayList;
import java.util.List;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Integer previous = null;
        List<Integer> outputList = new ArrayList<>();
        for (int current : asteroids) {
            if (previous != null) {
                // 1. Current value is greater and there is no chance of collision
                if (current > 0) {
                    outputList.add(previous);
                } else {
                    // 2. Current value is negative and there is a chance of collision
                    // when the previous element has a different direction
                    if (previous > 0) {
                        if (Math.abs(current) < previous) {
                            outputList.add(previous);
                            continue;
                        }
                    } else {
                        // 3. previous and current in opposite direction, no collision
                        outputList.add(previous);
                    }
                }

            }
            previous = current;
        }

        return outputList.stream().mapToInt(Integer::intValue).toArray();
    }
}
