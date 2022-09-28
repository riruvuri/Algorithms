package graph.coursecompletion;

import java.util.ArrayList;
import java.util.List;

public class CourseCompletion {
    public boolean canCourseBeCompleted(int n, List<Integer> prerequisites,
                                                List<Integer> courses) {
        List<List<Integer>> adjCourseList = new ArrayList<>();
        int[] visited = new int[n];
        int[] arrival = new int[n];
        int[] departure = new int[n];
        int[] timestamp = new int[1];

        for (int i=0; i < n; i++) {
            adjCourseList.add(new ArrayList<>());

            visited[i] = -1;
            arrival[i] = -1;
            departure[i] = -1;
        }

        for (int i=0; i < prerequisites.size(); i++) {
            adjCourseList.get(prerequisites.get(i)).add(courses.get(i));
        }


        for (int i=0; i < n; i++) {
            if (visited[i] == -1) {
                if (hasCycle(i, visited, arrival, departure, adjCourseList, timestamp)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasCycle(int source, int[] visited, int[] arrival,
                             int[] departure, List<List<Integer>> adjCourseList, int[] timestamp) {
        visited[source] = 1;
        arrival[source] = ++timestamp[0];

        List<Integer> courseList = adjCourseList.get(source);

        for (int course : courseList) {
            if (visited[course] == -1) {
                if (hasCycle(course, visited, arrival, departure, adjCourseList, timestamp)) {
                    return true;
                }
            } else {
                if (departure[course] == -1) {
                    return true;
                } else {
                    // arr[source] < arr[neighbor] - forward edge
                    // arr[source] > arr[neighbor] - cross edge
                }
            }
        }


        departure[source]= ++timestamp[0];
        return false;
    }

}
