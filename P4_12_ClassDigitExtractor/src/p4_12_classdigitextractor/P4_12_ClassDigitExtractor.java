/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_12_classdigitextractor;

import java.util.Scanner;

/**
 *
 * @author 213098
 */
public class P4_12_ClassDigitExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number (<= 5 digits)");
        int num = in.nextInt();
        
        DigitExtractor myExtractor = new DigitExtractor(num);
        
        System.out.println(myExtractor.nextDigit());
        System.out.println(myExtractor.nextDigit());
        System.out.println(myExtractor.nextDigit());
        System.out.println(myExtractor.nextDigit());
        System.out.println(myExtractor.nextDigit());
    }
    
}
