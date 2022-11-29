/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_12_roaches;

/**
 *
 * @author 213098
 */
public class P3_12_Roaches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RoachPopulation fear = new RoachPopulation(10); //make a new roach population
        //fear.initialPopulation(10); //set the size of the population to 10
        fear.waitForDoubling(); //let the population double
        fear.spray(); //kill 10% of roaches
        System.out.println(fear.getRoaches()); //print out how many roaches are left
        
        fear.waitForDoubling();
        fear.spray();
        System.out.println(fear.getRoaches());
        
        fear.waitForDoubling();
        fear.spray();
        System.out.println(fear.getRoaches());
        
        fear.waitForDoubling();
        fear.spray();
        System.out.println(fear.getRoaches());
    }
    
}
