package edu.act.restaurant.entity;

/**
 *
 * @author chaikal
 */
class Ingredient {
    
    private String name;
    private int amount;
    
    public Ingredient(String someName){
        this.name = someName;
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
    
}
