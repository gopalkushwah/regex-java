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
public class SplitMethod {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\\s");   //split the given string by space
//        String[] s = p.split("Gopal kushwah 15101999");
//        for(String s1 :s){
//            System.out.println(s1);
//        }
//        
//                Gopal
//                kushwah
//                15101999
//***************************************************************************************************
//        Pattern p = Pattern.compile("a");   //split the given string by a
//        String[] s = p.split("Gopal kushwah 15101999");
//        for(String s1 :s){
//            System.out.println(s1);
//        }
        
//        Output : 
//        Gop
//        l kushw
//        h 15101999
////***************************************************************************************************
//        Pattern p = Pattern.compile("\\.");   //split the given string by .
//        String[] s = p.split("www.stuadvisor.com.in");
//        for(String s1 :s){
//            System.out.println(s1);
//        }
        
//        Output : 
//                www
//                stuadvisor
//                com
//                in
////***************************************************************************************************
        Pattern p = Pattern.compile("[.]");   //split the given string by .
        String[] s = p.split("www.stuadvisor.com.in");
        for(String s1 :s){
            System.out.println(s1);
        }
//        Output : 
//                www
//                stuadvisor
//                com
//                in
//***************************************************************************************************
    }
}
