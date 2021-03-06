package edu.act.restaurant.entity;

/**
 *
 * @author chaikal
 */
public class Ingredient {
    
    private String name;
    private int amount;
    
    public Ingredient(String someName, int stockAmount){
        this.name = someName;
        this.amount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true;
       if(! (obj instanceof Ingredient) ) return false;
       Ingredient other = (Ingredient)obj;
       return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }   

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
