/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase.java;

import javax.swing.JOptionPane;

/**
 *
 * @author nider6687
 */
public class LemurDatabaseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        String nLemurs;
        nLemurs = JOptionPane.showInputDialog("How many Lemurs do you want to add to the list?");
        int num = Integer.parseInt(nLemurs);

        Lemur lemurs[] = new Lemur[num];

        for(int i = 0; i < num; i++){
            choice = Integer.parseInt(JOptionPane.showInputDialog("Please enter the type of Lemur to add:\n"
                    + "1 - Tree Lemur\n2 - Desert Lemur\n3 - JungleLemur"));
            if(choice == 1){
                System.out.println("Creating Tree Lemur.");
                lemurs[i] = new TreeLemur();
            }
            else if(choice == 2){
                System.out.println("Creating Desert Lemur.");
                lemurs[i] = new DesertLemur();
            }
            else if(choice == 3){
                System.out.println("Creating Jungle Lemur.");
                lemurs[i] = new JungleLemur();
            }
            else {
                System.out.println("Invalid selection. Try again.");
                i--;
            }
        }

        System.out.println("Displaying the list of Lemurs:\n--------------------------------------------\n");

        for(int i = 0; i < num; i++){
            System.out.println(lemurs[i]);
        }
    }
}
    
