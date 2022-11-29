/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_3_savingsaccount;

/**
 *
 * @author 213098
 */
public class P3_3_SavingsAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(1000, 10);
        
        System.out.println("Initial balance = " + s1.getBalance());
        System.out.println("Interest rate = " + s1.getRate() + "% \n");
        
        s1.addInterest();
        System.out.println(s1.getBalance());
        s1.addInterest();
        System.out.println(s1.getBalance());
        s1.addInterest();
        System.out.println(s1.getBalance());
        s1.addInterest();
        System.out.println(s1.getBalance());
        s1.addInterest();
        System.out.println(s1.getBalance());
        
    }
    
}
