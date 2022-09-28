package graph.coursecompletion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseSchedule {

    static int time = 0;
    static ArrayList<Integer> course_schedule(Integer n, ArrayList<ArrayList<Integer>> prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();

        int[] visited = new int[n];
        int[] arrival = new int[n];
        int[] departed = new int[n];
        for (int i=0; i < n; i++) {
            adjList.add(new ArrayList<>());

            visited[i] = -1;
            arrival[i] = -1;
            departed[i] = -1;
        }

        for (int i=0; i < prerequisites.size(); i++) {
            ArrayList<Integer> prerequisite = prerequisites.get(i);

            adjList.get(prerequisite.get(0)).add(prerequisite.get(1));
        }

        ArrayList<Integer> outputList = new ArrayList<>();
        for (int i=0; i < n; i++) {
            if (visited[i] == -1) {
                if (dfsHasCycle(i, visited, arrival, departed, adjList, outputList)) {

                    return new ArrayList<>(Arrays.asList(-1));
                }
            }
        }
        return outputList;
    }

    static boolean dfsHasCycle(int vertex, int[] visited, int[] arrival, int[] departed, List<List<Integer>> adjList, ArrayList<Integer> outputList) {
        visited[vertex] = 1;
        arrival[vertex] = ++time;


        List<Integer> neighbors = adjList.get(vertex);

        for (Integer neighbor : neighbors) {
            if (visited[neighbor] == -1) {
                if (dfsHasCycle(neighbor, visited, arrival, departed, adjList, outputList)) {
                    return true;
                }
            } else {
                if (departed[neighbor] == -1) {
                    return true;
                }
            }
        }
        outputList.add(vertex);
        departed[vertex] = ++time;
        return false;

    }

}
