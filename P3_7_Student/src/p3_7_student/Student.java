/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_7_student;

/**
 * me irl
 * @author 213098
 */
public class Student {
    
    private String name;
    private double quizzes;
    private double score;
    
    /**
     * A fake student
     * @param name the student's name
     */
    
    public Student(String name)
    {
        this.name = name;
    }
    
    /**
     * The total quiz score 
     * @return total score
     */
    public double totalScore()
    {
        return score;
    }
    
    /**
     * Gets the name of the student
     * @return student's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Adds a quiz score to a student's total score
     * @param score 
     */
    public void addQuiz(int score)
    {
        quizzes = quizzes + 1;
        this.score = this.score + score; 
    }
    
    public double getTotalScore()
    {
        return totalScore();
    }
    
    public double getAverageScore()
    {
        return (getTotalScore() / quizzes);
    }
    
}
