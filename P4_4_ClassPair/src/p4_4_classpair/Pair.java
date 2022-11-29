/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_4_classpair;

/**
 *
 * @author 213098
 */
public class Pair {
    
    private double first;
    private double second;
    
    /**
     * Constructs a pair.
     * @param aFirst the first value of the pair.
     * @param aSecond the second value of the pair.
     */
    public Pair(double aFirst, double aSecond) {
        first = aFirst;
        second = aSecond;
    }
    
    /**
     * Computes the sum of the values of this pair.
     * @return the sum of the first and second values.
     */
    public double getSum() {
        return first + second;
    }
    
    public double getDifference() {
        return first - second;
    }
    
    public double getProduct() {
        return first * second;
    }
    
    public double getAvg() {
        return (first + second)/2;
    }
    
    public double getDistance() {
        return Math.abs((first - second));
    }
    
    public double getMax() {
        return Math.max(first, second);
    }
    
    public double getMin() {
        return Math.min(first, second);
    }
}
