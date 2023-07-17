/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.regex.*;
/**
 *
 * @author gopal
 */
public class NameStartFromA {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("^[aA][a-zA-Z]* [a-zA-Z]*$");
//        Matcher m = p.matcher("Anil yadav");
////        Matcher m = p.matcher("nnil yadav");
//        if(m.find()){
//            System.out.println("true");
//        }else
//            System.out.println("false");
        Pattern p = Pattern.compile("^[a-zA-Z]*[lL] [a-zA-Z]*$");
//        Matcher m = p.matcher("Anil yadav");
        Matcher m = p.matcher("dilip yadav");
        if(m.find()){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
