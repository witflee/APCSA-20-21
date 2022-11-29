/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p13_8_accounttester;

import java.util.Random;

/**
 *
 * @author 213098
 */
public class P13_8_AccountTester {

    /**
     * This program tests the BankAccount class and
     * its subclasses.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            //FROM TEXTBOOK
        
        SavingsAccount momsSavings
                = new SavingsAccount(0.5);

        CheckingAccount harrysChecking
                = new CheckingAccount(100);

        momsSavings.deposit(10000);

        momsSavings.transfer(2000, harrysChecking);
        harrysChecking.withdraw(1500);
        harrysChecking.withdraw(80);

        momsSavings.transfer(1000, harrysChecking);
        harrysChecking.withdraw(400);

        // Simulate end of month
        momsSavings.addInterest();
        harrysChecking.deductFees();

        System.out.println("Mom's savings balance: "
                + momsSavings.getBalance());
        System.out.println("Expected: 7035");

        System.out.println("Harry's checking balance: "
                + harrysChecking.getBalance());
        System.out.println("Expected: 1116");
        */
        
            //P13.8 PROGRAMMING EXERCISE
        
        /*
         *  Reorganize the bank account classes as follows. In the
         *  BankAccount class, introduce an abstract method endOfMonth with
         *  no implementation. Rename the addInterest and deductFees
         *  methods into endOfMonth in the subclasses. Which classes are now
         *  abstract and which are concrete? Write a static method void
         *  test(BankAccount account) that makes five random transactions and
         *  then calls endOfMonth. Test it with instances of all concrete account
         *  classes.
         */
        
        BankAccount testCheckAcc = new CheckingAccount(500);
        test(testCheckAcc);
        //test savings
        
        
            //P13.8 PART 2
        
        /*
         *  Choose two of the Object methods (toString, equals, clone) and override 
         *  them in the Checking Account or Savings Account class.  In the main 
         *  method add code to prove that your override methods work as intended.
         */
        
    }
    
    static void test(BankAccount account)
    {
        //make 5 random transactions, print out after each
        //call endOfMonth and print out balance
        Random genI = new Random();
        Random genB = new Random();
        //genI.nextInt(100);
        //genB.nextInt(2);
        for (int i = 0; i < 5; i++) {
            int gb = genB.nextInt(100);
            int gi = genB.nextInt(2);
            
            if (gi == 0) 
            {
                account.deposit(gb);
                System.out.println("Deposit  $"+ gb +", Balance = $"+account.getBalance()+"0");
            }
            else
            {
                account.withdraw(gb);
                System.out.println("Withdraw $"+ gb +", Balance = $"+account.getBalance()+"0");
            }
            
        }
        
        account.endOfMonth();
        System.out.println("Balance $"+account.getBalance()+"0");
        /*
        if (account.getBalance() < 0.0)
            System.out.println("That wasn't supposed to happen!");
        */
    }
    
}
