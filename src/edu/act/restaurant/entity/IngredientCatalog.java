package edu.act.restaurant.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chaikal
 */
public class IngredientCatalog {
    
    private static List<Ingredient> ingredients = new ArrayList<>();

    private IngredientCatalog(){}
    
    public static void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    
    public static List<Ingredient> getIngredients() {
        return ingredients;
    }
    
}
