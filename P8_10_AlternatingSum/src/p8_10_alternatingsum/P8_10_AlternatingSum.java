/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8_10_alternatingsum;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 213098
 */
public class P8_10_AlternatingSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            //INPUT
        
        Scanner numIn = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int inputNum = numIn.nextInt();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input Numbers: ");
        String input = in.nextLine();
        
            //VARIABLES
        
        int[] nums = new int[inputNum];
        boolean add = true; //swaps between add and subtract (true and false respectively)
        String holder = "err";
        int pos1 = 0;
        int pos2 = 2;
        int numHolder;
        int equation = 0;
        
        String newInput = "err";
        
        String placeholder = "123";
        
            //METHOD (TO THE MADNESS)
        
        for (int i = 0; i < inputNum; i++) {
            pos1 = 0;
            pos2 = input.indexOf(" ");
            
            if (pos2 == -1)
            {
                pos2 = input.length();
            }
            
            holder = input.substring(pos1, pos2);
            
            nums[i] = Integer.parseInt(holder);
            
            if(pos2 == input.length())
            {
                break;
            }
            else
            {
                input = input.substring(pos2 +1, input.length());
            }
        }
        
        //System.out.println(Arrays.toString(nums));
        
        for (int i = 0; i < nums.length; i++) {
            if(add)
            {
                equation += nums[i];
                add = false;
            }
            else
            {
                equation -= nums[i];
                add = true;
            }
        }
        
        System.out.println(equation);
    }
    
}
