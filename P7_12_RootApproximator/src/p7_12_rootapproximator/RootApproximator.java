/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_12_rootapproximator;

/**
 *
 * @author 213098
 */
public class RootApproximator {
    
    private double guess;
    private double lastGuess=100;
    private double input;
    
    private double x = 1;
    private double a = 1;
    
    
    public RootApproximator(double n)
    {
        input = n;
    }
    
    boolean hasMoreGuesses()
    {
        //guess square roots
        //if x is guess for _/a, then average of x and a/x is better guess

        if (Math.abs(guess - lastGuess) < .000001)
        {
            return false;
        }
        else if (guess >= input)
        {
            System.out.println("HIT UPPER LIMIT");
            return false;
        }
        else
        {
            lastGuess = guess;
            return true;
        }
    }
    
    double nextGuess()
    {
        guess = (x + (input/x))/2;
        x = guess;
        return guess;
    }
}
