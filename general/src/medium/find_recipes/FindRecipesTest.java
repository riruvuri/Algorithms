package medium.find_recipes;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindRecipesTest {

    @Test
    public void simple_test() {
        String[] recipes = {"bread","sandwich","burger"};
        List<List<String>> ingredientList = Arrays.asList(Arrays.asList("yeast","flour"),
                                                            Arrays.asList("bread","meat"),
                                                            Arrays.asList("sandwich","meat","bread"));
        String[] supplies = {"yeast","flour","meat"};
        FindRecipes findRecipes = new FindRecipes();
        List<String> recipeList = findRecipes.findAllRecipes(recipes, ingredientList, supplies);

        Assert.assertTrue(Arrays.asList("bread","sandwich","burger").equals(recipeList));

    }
}
