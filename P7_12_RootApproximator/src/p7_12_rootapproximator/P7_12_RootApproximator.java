/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7_12_rootapproximator;

import java.util.Scanner;

/**
 *
 * @author 213098
 */
public class P7_12_RootApproximator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number: ");
        double n = in.nextDouble();
        RootApproximator r = new RootApproximator(n);
        while (r.hasMoreGuesses())
            System.out.println(r.nextGuess());
    }
    
}
