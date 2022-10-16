package medium10.course_schedule;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    int timestamp = 1;
    public boolean canFinish(int numOfCourses, int[][] preRequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] visited = new int[numOfCourses];
        int[] departed = new int[numOfCourses];

        for (int i=0; i < numOfCourses; i++) {
            visited[i] = -1;
            departed[i] = -1;
            adjList.add(new ArrayList<>());
        }

        for (int[] preReq : preRequisites) {
            adjList.get(preReq[1]).add(preReq[0]);
        }

        boolean result = true;
        for (int i=0; i < numOfCourses; i++) {
            if (visited[i] == -1 && hasCyclesHelper(adjList, visited, departed, i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean hasCyclesHelper(List<List<Integer>> adjList, int[] visited, int[] departed, int currentCourse) {
        visited[currentCourse] = 1;

        List<Integer> neighbors = adjList.get(currentCourse);
        for (Integer neighbor : neighbors) {
            if (visited[neighbor] == -1) {

                if (hasCyclesHelper(adjList, visited, departed, neighbor)) {
                    return true;
                }
                //visited[neighbor] = 1;
            } else {
                if (departed[neighbor] == -1) {
                    return true;
                }
            }
        }

        departed[currentCourse] = ++timestamp;
        return false;
    }


}
