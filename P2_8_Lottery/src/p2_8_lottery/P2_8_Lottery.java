/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_8_lottery;
import java.util.Random;
/**
 *
 * @author 213098
 */
public class P2_8_Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random();
        //int 
        System.out.println("Play this combination - it'll make you rich! " + 
        (generator.nextInt(49) + 1) + " " + 
        (generator.nextInt(49) + 1) + " " + 
        (generator.nextInt(49) + 1) + " " + 
        (generator.nextInt(49) + 1) + " " + 
        (generator.nextInt(49) + 1) + " " + 
        (generator.nextInt(49) + 1));
        //System.out.println(
        //(generator.nextInt(49) + 1) + " " + 
        //(generator.nextInt(49) + 1) + " " + 
        //(generator.nextInt(49) + 1) + " " + 
        //(generator.nextInt(49) + 1) + " " + 
        //(generator.nextInt(49) + 1) + " " + 
        //(generator.nextInt(49) + 1));
        
    }
    
}
