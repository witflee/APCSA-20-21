/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_7_student;

/**
 *
 * @author 213098
 */
public class P3_7_Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Jim");
        System.out.println(s1.getName());
        System.out.println(s1.getTotalScore());
        s1.addQuiz(90);
        System.out.println(s1.getTotalScore());
        s1.addQuiz(50);
        s1.addQuiz(70);
        
        s1.addQuiz(71);
        System.out.println(s1.getTotalScore());
        System.out.println(s1.getAverageScore());
    }
    
}
