package edu.act.restaurant.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author chaikalis
 */
public class Order {
    
    private int code;
    
    private List<Plate> orderPlates = new ArrayList<>();
    
    public Order(){
    }
   
    public Order(int aCode){
        code = aCode;
    }
    
    public void addPlate(Plate somePlate){
        orderPlates.add(somePlate); 
    }

    public int getCode() {
        return code;
    }

    public List<Plate> getOrderPlates() {
        return orderPlates;
    }
    
    public Plate findPlateByName(String plateName){
        for(Plate plate: orderPlates){
            if(plate.getName().equals(plateName)){
                return plate;
            }
        }
        return null;
    }
       
    public int getNumberOfPlates(){
        return orderPlates.size();
    }    
    
}
