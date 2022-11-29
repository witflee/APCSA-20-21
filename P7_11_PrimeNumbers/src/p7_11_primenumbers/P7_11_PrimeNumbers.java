/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_11_primenumbers;

import java.util.Scanner;

/**
 *
 * @author 213098
 */
public class P7_11_PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter upper limit: ");
        int limit = in.nextInt();
        
        PrimeGenerator pg = new PrimeGenerator();
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        System.out.println(pg.nextPrime());
        
//        boolean done = false;
//        while (!done)
//        {
//            int prime = pg.nextPrime();
//            if  (prime > limit)
//                done = true;
//            else
//                System.out.println(prime);
//        }
    }
    
}
