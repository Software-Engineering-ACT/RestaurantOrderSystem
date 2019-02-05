package edu.act.restaurant.entity;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chaikal
 */
class Plate {
    
    private String name;
    
    private Map<Ingredient, Integer> ingredientMap;
    
    public Plate(){
        ingredientMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
