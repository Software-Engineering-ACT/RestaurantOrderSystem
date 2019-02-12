package edu.act.restaurant.entity;

/**
 *
 * @author chaikal
 */
public class Initializer {

    public static void init() {
        
        Plate nice = new Plate();
        nice.setName("Spaggeti with meatballs");
        
        Ingredient spaggeti = new Ingredient("Spaggeti", 20000);
        Ingredient tomato = new Ingredient("Tomato Sauce", 5000);
        Ingredient oil = new Ingredient("Olive Oil", 6500);
        Ingredient meat = new Ingredient("Meat", 58000);
        
        IngredientCatalog.addIngredient(spaggeti);
        IngredientCatalog.addIngredient(tomato);
        IngredientCatalog.addIngredient(oil);
        IngredientCatalog.addIngredient(meat);
               
        nice.storeIngredient(spaggeti, 300);
        nice.storeIngredient(tomato, 150);
        nice.storeIngredient(oil, 30);
        nice.storeIngredient(meat, 500);

        PlateCatalog.addPlate(nice);
        
        nice.displayIngredients();
    }
    
}
