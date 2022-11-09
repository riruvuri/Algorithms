package medium.find_recipes;

import java.util.*;

/**
 * LC: 2115
 * https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/solutions/2571032/java-topo-sort-solution/
 *
 */
public class FindRecipes {
    public List<String> findAllRecipes(String[] recipes,
                                       List<List<String>> ingredients,
                                       String[] supplies) {
        // Adjacency map
        Map<String, List<String>> adjacencyMap = new HashMap<>();
        int[] indegree = new int[recipes.length];
        Map<String, Integer> recipeIndexMap = new HashMap<>();

        for (int i=0; i < recipes.length; i++) {
            for (int j=0; j < ingredients.get(i).size(); j++) {
                String ingredient = ingredients.get(i).get(j);
                adjacencyMap.putIfAbsent(ingredient, new ArrayList<>());

                adjacencyMap.get(ingredient).add(recipes[i]);
                indegree[i]++;
            }
            recipeIndexMap.put(recipes[i], i);
        }

        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(supplies));

        List<String> possibleRecipes = new ArrayList<>();

        while (!queue.isEmpty()) {
            String supplyIngredient = queue.poll();

            if (!adjacencyMap.containsKey(supplyIngredient)) {
                continue;
            }

            for (String ingredientRecipe : adjacencyMap.get(supplyIngredient)) {
                int recipeIdx = recipeIndexMap.get(ingredientRecipe);

                if (--indegree[recipeIdx] == 0) {
                    queue.add(ingredientRecipe);
                    possibleRecipes.add(ingredientRecipe);
                }
            }
        }

        return possibleRecipes;
    }
}
