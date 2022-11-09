package hard.robot_cleaner;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.youtube.com/watch?v=003zjWlDeq8
 */

/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */

public class RobotRoomCleaner {
    private Robot robot = null;
    private final int[][] directions = {{-1,0},{0,1}, {1,0}, {0,-1}};
    private Set<String> visited = new HashSet<>();

    public void cleanRoom(Robot robot) {
        this.robot = robot;

        // 1. Initial position at which Robot is placed
        dfs(0, 0, 0);
    }

    private void dfs(int row, int col, int roboMove) {

        // 2. Clean this cell and move onto the next one.
        visited.add(row+","+col);
        robot.clean();

        // Default move direction is UP
        for (int i=0; i < directions.length; i++) {
            int currentDirection = (roboMove + i) % 4;
            int currentRow = row + directions[currentDirection][0];
            int currentCol = col + + directions[currentDirection][1];

            if (!visited.contains(currentRow+","+currentCol)) {
                if (robot.move()) {
                    dfs(currentRow, currentCol, currentDirection);
                }
            }

            // Change the direction of the move
            robot.turnRight();
        }

        moveBack();
    }

    private void moveBack() {
        robot.turnRight();
        robot.turnRight();

        robot.move();

        robot.turnLeft();
        robot.turnLeft();
    }
}

interface Robot {
    public boolean move();

    public void turnLeft();

    public void turnRight();

    public void clean();
}