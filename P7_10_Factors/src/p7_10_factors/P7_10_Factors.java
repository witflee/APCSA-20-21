/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_10_factors;

import java.util.Scanner;

/**
 * Test driver class for FactorGenerator class.
 * @author 213098
 */
public class P7_10_Factors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = in.nextInt();
        
        FactorGenerator myFacGenerator = new FactorGenerator(num);
        while (myFacGenerator.hasMoreFactors())
            System.out.println(myFacGenerator.nextFactor());
        
        
//        int num = 8;
//        double numdiv = num / 2.0;
//        System.out.println(numdiv);
//        System.out.println(numdiv % 1); //tests for decimal places
    }
    
}
