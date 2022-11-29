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
public class RoachPopulation {
    
    
    private int roaches;
    
    /**
     * Sets the size of the initial population of roaches
     * @param size initial population size
     */
    public RoachPopulation(int size)
    {
        roaches = size;
    }
    
    /**
     * Double the roach population
     */
    public void waitForDoubling()
    {
        roaches *= 2;
    }
    
    /**
     * Kill 10% of roaches
     * (Rounded up to the nearest whole number)
     */
    public void spray()
    {
        roaches *= .9;
    }
    
    /**
     * Get the number of roaches left alive
     * @return number of roaches
     */
    public int getRoaches()
    {
        return roaches;
    }
}
