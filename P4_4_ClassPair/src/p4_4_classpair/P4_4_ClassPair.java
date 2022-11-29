/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_4_classpair;
import java.util.Scanner;
/**
 *
 * @author 213098
 */
public class P4_4_ClassPair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first number.");
        double first = in.nextDouble();
        System.out.println("Enter second number.");
        double second = in.nextDouble();
        
        Pair pear = new Pair(first, second);
        System.out.println("Sum = "+pear.getSum());
        System.out.println("Difference = "+pear.getDifference());
        System.out.println("Product = "+pear.getProduct());
        System.out.println("Average = "+pear.getAvg());
        System.out.println("Distance = "+pear.getDistance());
        System.out.println("Maximum = "+pear.getMax());
        System.out.println("Minimum = "+pear.getMin());
    }
    
}
