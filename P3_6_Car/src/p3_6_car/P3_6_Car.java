/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_6_car;

/**
 *
 * @author 213098
 */
public class P3_6_Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car zoom = new Car(20);
        zoom.addGas(20);
        zoom.drive(90);
        zoom.drive(10);
        System.out.println(zoom.getGas());
        System.out.println(zoom.getOdometer());
        /*
        zoom.drive(100);
        System.out.println(zoom.getGas());
        zoom.drive(100);
        System.out.println(zoom.getGas());
        System.out.println(zoom.getOdometer());
        */
    }
    
}
