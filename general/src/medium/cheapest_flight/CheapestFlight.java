package medium.cheapest_flight;

import java.util.ArrayList;
import java.util.List;

public class CheapestFlight {
    int minCost = Integer.MAX_VALUE;
    int currentCost = 0;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adjList = new ArrayList<>();

        for (int i=0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i=0; i < flights.length; i++) {
            int[] flightDetails = flights[i];
            Pair pair = new Pair(flightDetails[0], flightDetails[1], flightDetails[2]);
            adjList.get(flightDetails[0]).add(pair);
        }

        dfs(src, dst, 0, k, adjList, 0);

        return minCost;
    }

    private void dfs(int src, int dst, int current, int k, List<List<Pair>> adjList, int currentCost) {
        if (current == k+1 && src != dst) {
            return;
        }

        // base case
        if (src == dst) {
            minCost = Math.min(minCost, currentCost);
            return;
        }

        // Get neighbors for src
        List<Pair> neighbors = adjList.get(src);
        for (Pair pair : neighbors) {
            dfs(pair.destination, dst, current + 1, k, adjList, currentCost + pair.cost);
        }

    }
}

class Pair {
    int source;
    int destination;
    int cost;

    Pair(int source, int destination, int cost) {
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }
}