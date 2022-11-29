/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_12_classdigitextractor;

/**
 *
 * @author 213098
 */
public class DigitExtractor {
    
    private int num;
    private int modNum;
    
    /**
     * Constructs a digit extractor that gets the digits
     * of an integer in reverse order.
     * @param anInteger the integer to break up into digits
     */
    public DigitExtractor(int anInteger){
        num = anInteger;
    }
    
    /**
     * Returns the next digit to be extracted.
     * @return the next digit
     */
    public int nextDigit(){
        modNum = num % 10; //get last digit
        //num = num - modNum; //subtract last digit
        num = num / 10;
        return modNum;
    }
}
