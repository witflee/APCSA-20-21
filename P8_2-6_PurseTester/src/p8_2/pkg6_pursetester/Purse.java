/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8_2.pkg6_pursetester;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author 213098
 */
public class Purse {
    ArrayList<String> coins = new ArrayList<String>();
    
        // METHODS
    
    public Purse()
    {
        
    }
    
    public void add(String coinName)
    {
        coins.add(coinName);
    }
    
    public String toString()
    {
        return "Purse"+coins.toString();
    }
    
    public void reverse()
    {
        for (int x = 0; x < coins.size(); x++) 
        {
            String holder = coins.get(x);
            coins.remove(x);
            coins.add(0,holder);
        }
    }
    
    public void transfer(Purse other)
    {
        for (int x = 0; x < other.coins.size(); x++) 
        {
            String holder = other.coins.get(x);
            other.coins.remove(x);
            coins.add(holder);
            
            if(other.coins.size() == 1)
            {
                holder = other.coins.get(0);
                other.coins.remove(0);
                coins.add(holder);
            }
        }
    }
    
    public boolean sameContents(Purse other)
    {
        if (coins.equals(other.coins))
            return true;
        else
            return false;
    }
    
    public boolean sameCoins(Purse other)
    {
        ArrayList<String> coinsAlpha = new ArrayList<String>();
        ArrayList<String> otherCoinsAlpha = new ArrayList<String>();
        
        for (int i = 0; i < coins.size(); i++) {
            coinsAlpha.add(coins.get(i));
        }
        
        for (int i = 0; i < other.coins.size(); i++) {
            otherCoinsAlpha.add(other.coins.get(i));
        }
        
        //sort both ArrayLists alphabetically (case sensitive)
        Collections.sort(coinsAlpha);
        Collections.sort(otherCoinsAlpha);
        
        if (coinsAlpha.equals(otherCoinsAlpha))
            return true;
        else
            return false;
    }
}
