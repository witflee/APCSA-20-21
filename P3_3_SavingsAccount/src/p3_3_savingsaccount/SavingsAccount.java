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
/**
    A savings account has a balance that can be changed by deposits and withdrawals.
*/
public class SavingsAccount
{
    /**
        Constructs a savings account with a zero balance.
    */
    public SavingsAccount()
    {
        balance = 0;
    }
 
    /**
        Constructs a savings account with a given balance.
        @param initialBalance the initial balance
        @param rate the interest rate
    */
    public SavingsAccount(double initialBalance, double rate)
    {
        balance = initialBalance;
        this.rate = (rate / 100.0);
        
    }
 
    /**
        Deposits money into the savings account.
        @param amount the amount to deposit
    */
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }
 
    /**
        Withdraws money from the savings account.
        @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
    }
 
    /**
        Gets the current balance of the savings account.
        @return the current balance
    */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     *  Sets the interest rate of the savings account.
     *  @param rate the interest rate
     */
    
    public void addInterest()
    {
        double newBalance = balance + (rate * balance);
        balance = newBalance;
    }
    
    /**
     * Gets the current interest rate of the savings account.
     * @return the current rate
     */
    public double getRate()
    {
        return rate * 100;
    }
    
    private double balance;
    private double rate;
}

