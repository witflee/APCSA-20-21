/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8_2.pkg6_pursetester;
import java.util.ArrayList;
/**
 *
 * @author 213098
 */
public class P8_26_PurseTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Purse p = new Purse();
        p.add("Quarter");
        p.add("Dime");
        p.add("Nickel");
        p.add("Dime");

        System.out.println("Original purse: " + p.toString());
        p.reverse();
        System.out.println("Reversed purse: " + p.toString());

        Purse b = new Purse();
        b.add("Dime");
        b.add("Nickel"); 

        System.out.println("BEFORE TRANSFER:");     
        System.out.println("Purse p: " + p.toString());
        System.out.println("Purse b: " + b.toString());

        p.transfer(b);

        System.out.println("AFTER TRANSFER:");     
        System.out.println("Purse p: " + p.toString());
        System.out.println("Purse b: " + b.toString());
      
        Purse c = new Purse();
        c.add("Quarter");
        c.add("Dime");

        Purse d = new Purse();
        d.add("Quarter");
        d.add("Dime");
      
        System.out.println("BEFORE SAME CONTENTS");     
        System.out.println("Purse c: " + c.toString());
        System.out.println("Purse d: " + d.toString());
        System.out.println("SAME CONTENTS: " + c.sameContents(d));

        Purse e = new Purse();      
        e.add("Nickel");
        e.add("Dime");
        e.add("Nickel");
      
        Purse f = new Purse();      
        f.add("Nickel");
        f.add("Dime");
        f.add("Quarter");

        System.out.println("BEFORE SAME CONTENTS2");     
        System.out.println("Purse e: " + e.toString());
        System.out.println("Purse f: " + f.toString());
        System.out.println("SAME CONTENTS2: " + e.sameContents(f));

        Purse g = new Purse();
        g.add("Quarter");
        g.add("Dime");
        g.add("Nickel");
        g.add("Dime");        

        Purse h = new Purse();    
        h.add("Nickel");
        h.add("Dime");   
        h.add("Dime");      
        h.add("Quarter"); 

        System.out.println("BEFORE SAME COINS");     
        System.out.println("Purse g: " + g.toString());
        System.out.println("Purse h: " + h.toString());
        System.out.println("SAMECOINS: " + g.sameCoins(h));

        Purse j = new Purse();
        j.add("Quarter");
        j.add("Penny");
        j.add("Nickel");
        j.add("Dime");        

        Purse k = new Purse();    
        k.add("Nickel");
        k.add("Dime");   
        k.add("Dime");         
        k.add("Quarter");

        System.out.println("BEFORE SAME COINS2");     
        System.out.println("Purse g: " + j.toString());
        System.out.println("Purse h: " + k.toString());
        System.out.println("SAMECOINS2: " + j.sameCoins(k));
    }
    
}
