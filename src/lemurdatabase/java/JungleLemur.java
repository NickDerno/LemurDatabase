/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase.java;

/**
 *
 * @author nider6687
 */
public class JungleLemur extends Lemur{
    
    String food;
    String colour;
    String packSize;

    public JungleLemur(){
        
        food = "Mice, Snails, and Insects";
        colour = "Black or Blue";
        packSize = "Small groups";
    }
    
    public String getColour(){
        return colour;
    }
    
    public void setColour(String cJungle){
        colour = cJungle;
    }
    
    public String getFood(){
        return food;
    }
    
    public void setFood(String fJungle){
        food = fJungle;
    }
    
    public void setPackSize(String pJungle){
        packSize = pJungle;
    }
    
    public String getPackSize(){
        return packSize;
    }
    
    public String toString() {
        String output = "Jungle Lemur:\n" + super.toString() + "\n";
        output += "Food = " + getFood() + "\nColour = " + getColour() + "\nPack Size = " + getPackSize() + "\n";
        return output;
    }

}