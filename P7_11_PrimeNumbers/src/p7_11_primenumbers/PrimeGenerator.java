/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_11_primenumbers;

/**
 *
 * @author 213098
 */
public class PrimeGenerator {
    
    private int limit;
    private int rNum; //returned number
    private double primeNum;
    private static int increment;
    
    public PrimeGenerator()
    {
        //limit = n;
    }
    
    int nextPrime()
    {
//        for (int i = 1; i <= limit; i++)
//        {
//            rNum = limit / i;
//        }
        
        
//        rNum = limit / increment;
//        increment++;
//        
//        if ((rNum % 1.0) == 0.0)
//            
//            return rNum;
//        else
//            return 100; //temp
        
//        if (rNum <= limit)
//            if (((rNum / 1) % 1 == 0.0) && ((rNum / 1) % 1 == 0.0))
//                return 10;
//            else
//                return 10;
//        else 
//            return 10;
        
        increment = 0;
        rNum++;
        
        while (increment <= limit)
        {
            increment++;
            
            if ((rNum / increment) % 1 == 0.0)
            {
                //System.out.println("increment = "+increment);
                //System.out.println("rnum/inrement = "+(rNum / increment));
                return rNum;
            }
        }
        
        return 0;
                
    }
    
//    boolean isPrime()
//    {
//        return true;
//    }
}
