/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.act.restaurant.control;

import edu.act.restaurant.entity.Ingredient;
import edu.act.restaurant.entity.Plate;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.AbstractListModel;

/**
 *
 * @author chaikal
 */
public class PlateIngredientListModel extends AbstractListModel<String> {

    private Plate plate;
    
    public PlateIngredientListModel(Plate plate){
        this.plate = plate;
    }
    
    @Override
    public int getSize() {
        return plate.getIngredientsSize();
    }

    @Override
    public String getElementAt(int index) {
        Map<Ingredient, Integer> map = plate.getIngredientMap();
        List<String> texts = new ArrayList<>();
        
        for(Ingredient i : map.keySet()){
            Integer quantity = map.get(i);
            texts.add(i.getName() + " - "+quantity+" gr");
        }
        
        return texts.get(index);
    }

    
}
