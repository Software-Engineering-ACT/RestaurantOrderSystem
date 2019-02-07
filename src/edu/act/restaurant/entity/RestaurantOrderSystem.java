package edu.act.restaurant.entity;

/**
 *
 * @author chaikal
 */
public class RestaurantOrderSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Plate nice = new Plate();
        nice.setName("Spaggeti with meatballs");
        
        Ingredient spaggeti = new Ingredient("Spaggeti");
        Ingredient tomato = new Ingredient("Tomato Sauce");
        Ingredient oil = new Ingredient("Olive Oil");
        Ingredient meat = new Ingredient("Meat");
        
        nice.storeIngredient(spaggeti, 300);
        nice.storeIngredient(tomato, 150);
        nice.storeIngredient(oil, 30);
        nice.storeIngredient(meat, 500);


        nice.displayIngredients();
    }
    
}
