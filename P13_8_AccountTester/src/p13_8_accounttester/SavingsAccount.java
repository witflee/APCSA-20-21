/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p13_8_accounttester;

/**
 * An account that earns interest at a fixed rate.
 * @author 213098
 */
public class SavingsAccount extends BankAccount{
    /**
       Constructs a bank account with a given interest rate.
       @param rate the interest rate
    */
    public SavingsAccount(double rate) 
    {  
        interestRate = rate;
    }

//    /**
//       Adds the earned interest to the account balance.
//    */
//    public void addInterest() 
//    {  
//        double interest = getBalance() * interestRate / 100;
//        deposit(interest); 
//    }

    private double interestRate;
   
        //TESTS
   
    public void endOfMonth() //copy addInterest() here
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest); 
    }
}
