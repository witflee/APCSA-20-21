/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_10_factors;

/**
 *
 * @author 213098
 */
public class FactorGenerator {
    //variables here
    private int input;
    private int next;
    private int factor;
    private double modnum;
    private int increment = 1;
    
    public FactorGenerator(int num)
    {
        input = num;
        
        for (int x = 0; x < 0; x++)
        {
            //factor = input / x;
        }
    }
    
    int x = 1;
    
    boolean hasMoreFactors()
    {
        
//        factor = input / x;
//        x++;
//        modnum = factor % 1.0;
//        if ((modnum == 0.0) && (factor > 0))
//            return true;
//        else
//            return false;
        
        //divide main term by lowest number until can't divide anymore
        //ex. 150 [2] --> 75 [3] --> 25 [5] --> 5 [5] --> 1
        
        increment++;
        next = factor / (factor/increment);
        
        if (next % 1 == 0)
        {
            return true;
        }
        return false;
    }
    
    double nextFactor()
    {
        return factor;
    }
}
