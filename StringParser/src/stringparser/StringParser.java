/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringparser;

import java.util.Scanner;

/**
 *
 * @author 213098
 */
public class StringParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String myName = "Elias James Weitfle";
        System.out.println(myName.substring(0, 5));
        System.out.println(myName.substring(6, 11));
        System.out.println(myName.substring(12, 19));
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input Name:");
        String yourName = in.nextLine();
        
        System.out.println("");
        String yourNameSplit = yourName.replaceFirst(" ", "\n");
        yourNameSplit = yourNameSplit.replaceFirst(" ", "\n");
        System.out.println(yourNameSplit);
        //System.out.println(yourName.substring(0,yourName.indexOf(' ')));
        //System.out.println(yourName.substring(yourName.indexOf(' ')+1,8));
        
    }
    
}
