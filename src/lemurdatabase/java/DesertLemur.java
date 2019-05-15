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
public class DesertLemur extends Lemur {
    private String food;
    private String colour;
    private double babyDeathRate;
    
    public DesertLemur(){
        food = "Cacti";
        colour = "White";
        babyDeathRate = 0.66;
    }
    
    public String getColour(){
        return colour;
    }
    
    public void setColour(String cDesert){
        colour = cDesert;
    }
    
    public String getFood(){
        return food;
    }
    
    public void setFood(String fDesert){
        food = fDesert;
    }
    
    public double getDeathRate(){
        return babyDeathRate;
    }
    
    public void setDeathRate(double deathDesert){
        babyDeathRate = deathDesert;
    }

    public String toString() {
        String output = "Desert Lemur:\n" + super.toString() + "\n";
        output += "Food = " + getFood() + "\nColour = " + getColour() + "\nBaby Death Rate = " + getDeathRate() + "\n";
        return output;
    }

}

