/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.regex.*;

/**
 * allowed characters are :
 * a-z   A-Z  0-9   #  $
 * 1). The length of identifier should be at least 2
 * 2). The first character should be lowercase alphabet
 *    symbol from a-k
 * 3). The Second character should be a digit divisible by 3
 * 0,3,6,9
 */
/**
 *
 * @author gopal
 */
public class YavaLanguageOwn {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[a-k][0369][a-zA-Z0-9#$]*$");
        Matcher m = p.matcher("a3Gopal#$54");
        if(m.find()){
            System.out.println("true");
        }else {
            System.out.println("false");
            
        }
    }
            
}
