/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_6_car;

/**
 * Fake car
 * @author 213098
 */

public class Car {
    
    private double fuel;
    private double miles;
    private double efficiency;
    
    /**
     * Constructs a car.
     */
    
    public Car()
    {
        fuel = 0;
    }
    
    /**
     * Sets the fuel efficiency of the car in miles per gallon.
     * @param mpg miles per gallon
     */
    
    public Car(double mpg)
    {
        fuel = 0;
        efficiency = mpg;
    }
    
    /**
     * Adds fuel to the fuel tank.
     * @param gas amount of fuel to add
     */
    
    public void addGas(double gas)
    {
        fuel = fuel + gas;
    }
    
    /**
     * Tells the car how far to drive, subtracting fuel based on the efficiency.
     * @param distance distance to drive
     */
    
    public void drive(double distance)
    {
        fuel = fuel - (distance * (1 / efficiency));
        miles = miles + distance;
    }
    
    /**
     * Gets the fuel amount left in the tank.
     * @return the fuel left in the tank
     */
    
    public double getGas()
    {
        return fuel;
    }
    
    /**
     * Gets the total distance driven by the car.
     * @return total distance driven
     */
    
    public double getOdometer()
    {
        return miles;
    }
}
