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
public class TreeLemur extends Lemur{
     
    String food;
    String colour;
    String packSize;
    
    public TreeLemur(){
        
        food = "Fruit";
        colour = "Red";
        packSize = "Large groups";
    }
            
    public String getColour(){
        return colour;
    }
    
    public void setColour(String cTree){
        colour = cTree;
    }
    
    public String getFood(){
        return food;
    }
    
    public void setFood(String fTree){
        food = fTree;
    }
    
    public void setPackSize(String pTree){
        packSize = pTree;
    }
    
    public String getPackSize(){
        return packSize;
    }

    public String toString() {
        String output = "Tree Lemur:\n" + super.toString() + "\n";
        output += "Food = " + getFood() + "\nColour = " + getColour() + "\nPack Size = " + getPackSize() + "\n";
        return output;
    }
}
