/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9_5_staticmethods;

/**
 *
 * @author 213098
 */
public class MathMethods {
    
    
    
   
    
    public static double sphereVolume(double r) {
        double num = (4.0/3.0)*Math.PI*Math.pow(r, 3);
        
        return num;
    }
    
    public static double sphereSurface(double r) {
        double num = 4.0*Math.PI*Math.pow(r, 2);
        
        return num;
    }
    
    public static double cylinderVolume(double r, double h) {
        double num = Math.PI*Math.pow(r, 2)*h;
        
        return num;
    }
    
    public static double cylinderSurface(double r, double h) {
        double num = 2*Math.PI*Math.pow(r, 2)+2*Math.PI*r*h;
        
        return num;
    }
    
    public static double coneVolume(double r, double h) {
        double num = (1.0/3.0)*Math.PI*Math.pow(r, 2)*h;
        
        return num;
    }
    
    public static double coneSurface(double r, double h) {
        double num = Math.PI*Math.pow(r, 2)+Math.PI*r*Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2));
        
        return num;
    }
}
