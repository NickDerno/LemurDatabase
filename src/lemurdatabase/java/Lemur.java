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
public class Lemur extends Mammal {
    
    String location = "Madagascar";
    String classification = "Prosimian";
    String coat = "Fur";

    public void groom() {
        System.out.println("The Lemur is grooming itself using its teeth as a comb.");
    }

    public String toString() {
        String output = super.toString();
        output += "Location = " + location + "\n";
        output += "Classification = " + classification + "\n";
        output += "Coat = " + coat;

        if(getGender().equals("Female")){
            output += "\nFemale Lemur = Dominant Role";
        }
        return output;
    }
}