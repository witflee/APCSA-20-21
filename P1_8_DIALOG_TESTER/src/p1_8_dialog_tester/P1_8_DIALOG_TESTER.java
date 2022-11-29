/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_8_dialog_tester;

import javax.swing.JOptionPane;

/**
 *
 * @author 213098
 */
public class P1_8_DIALOG_TESTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name + "!");
        System.exit(0);
    }
    
}
