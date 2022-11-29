/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_7_randomnumber;
import java.util.Random;
/**
 *
 * @author 213098
 */
public class P2_7_RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.println(generator.nextInt(6) + 1);
    }
    
}
