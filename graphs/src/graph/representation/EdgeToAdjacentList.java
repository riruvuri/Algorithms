package graph.representation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EdgeToAdjacentList {

    public List<List<Integer>>convertEdgeToAdjacencylist(Integer n, List<List<Integer>> edges) {
        if (edges == null || edges.size() == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> outputList = new ArrayList<>(n);

        for(int i = 0; i < n ; i++){
            outputList.add(new ArrayList<>());
        }

        for(List<Integer> edge : edges){
            outputList.get(edge.get(0)).add(edge.get(1));
            outputList.get(edge.get(1)).add(edge.get(0));
        }


        for(List<Integer> ls : outputList ) {
            Collections.sort(ls);
        }

        return outputList;
    }
}
