//       Author:  Elias Weitfle

// Completed On:  (11/19/20)

// Program Name:  NFL Jersey Order

// Folder Name:   C:\Users\213098\Desktop\AP CSA 20-21\Projects\NFL_Jersey_Order

// Description:   NFL, the National Football League, has contracted you to generate 
//                jersey orders. You have been supplied the order information and your job  
//                is to format the data as Order Tag to be forwarded to the vendors.
package nfl_jersey_order;

import java.util.Scanner;

/**
 *
 * @author 213098
 */
public class NFL_Jersey_Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Data: ");
        String data1 = in.nextLine();
        
        //String data1 = "Clark, Ken, XL : Steelers,Pittsburgh : Ward#86";
        //String data1 = "Sadfan, Guy, S : Bengals,Cincinnati : Burrows#9";
        //String data1 = "a, b, c : d,e : f#g";
        System.out.println("\n");
        
        String p1 = data1.substring(0, data1.indexOf(" : "));
        String p2 = data1.substring(data1.indexOf(":") + 2, data1.lastIndexOf(":"));
        String p3 = data1.substring(data1.lastIndexOf(":") + 2);
        
        String firstName = data1.substring(data1.indexOf(" ") + 1, data1.indexOf(", ", (data1.indexOf(" "))));
        String lastName = data1.substring(0, data1.indexOf(","));
        String size = data1.substring(firstName.length() + lastName.length() + 4, data1.indexOf(" :"));
        String city = p2.substring(p2.indexOf(",")+1, p2.length()-1);
        String team = p2.substring(0, p2.indexOf(","));
        String nameNumber = p3.replaceFirst("#"," - ");
        
        System.out.println(firstName + " " + lastName + "\n" + size + "\n" + city + "\n" + team.toUpperCase() + "\n" + nameNumber);
        
        
//        System.out.println("\nOutput should be:\n"
//                + "Ken Clark        \n"
//                + "XL               \n"
//                + "Pittsburgh       \n"
//                + "STEELERS         \n"
//                + "Ward - 86");
//        System.out.println("");
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
    }
    
}
