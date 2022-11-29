/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9_5_staticmethods;

import java.util.Scanner;

/**
 *
 * @author 213098
 */
public class P9_5_StaticMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Radius: ");
        double inputR = in.nextDouble();
        System.out.println("Input Height: ");
        double inputH = in.nextDouble();
        
        MathMethods geometry = new MathMethods();
        
        System.out.println("SPHERE VOLUME: "+geometry.sphereVolume(inputR));
        System.out.println("SPHERE SURFACE: "+geometry.sphereSurface(inputR));
        System.out.println("CYLINDER VOLUME: "+geometry.cylinderVolume(inputR,inputH));
        System.out.println("CYLINDER SURFACE: "+geometry.cylinderSurface(inputR,inputH));
        System.out.println("CONE VOLUME: "+geometry.coneVolume(inputR,inputH));
        System.out.println("CONE SURFACE: "+geometry.coneSurface(inputR,inputH));
    }
    
    
}
