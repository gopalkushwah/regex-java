/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.regex.*;
/**
 * the every mobile number should contains 10 digits    [0-9]
 * first digit should start from 6,7,8,9                [6-7]
 * Example : 9977355845
 * Example : 7974070349
 * Example : 8889153591
 * Example : 6264585980
 * Example : 5656326532  XXXXXXXXXX it is not valid
*/

/**
 *  ^ ==> starting of string 
 *  $ ==> end of string
 */
/**
 *  ()  ===> it represent a group
 */
/**
 * the every mobile number should contains 10 digits and (zero at start also it may be or may not be)
 * first digit may be zero or may not be              [6-7]
 * first digit should start from 6,7,8,9                [6-7]
*/
/**
 *
 * @author gopal
 */
public class ForMobileNumber {
    public static void main(String[] args) {
////        Pattern p = Pattern.compile("^[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$");
//        Pattern p = Pattern.compile("^[6-9][0-9]{9}$");    //[0-9] upto 9 times
//        
//        
//        Matcher m = p.matcher("99773558454646");
////        Matcher m = p.matcher("5977355845");
//
//        
//        if(m.find()){
//            System.out.println("Its is an valid mobile number");
//        }else System.out.println("Its is not an valid mobile number");
//
//
//        while(m.find()){
//            System.out.println(m.start());
//        }
////**********************************************************************************************************
////if my mobile number is of 11 digit 
////if my mobile number contains zero at start 
//        Pattern p = Pattern.compile("^(0)?[6-9][0-9]{9}$");    //zero may be or may not be 
//        Matcher m = p.matcher("05977355845");   // it is not an valid mobile number
//        Matcher m = p.matcher("5977355845");  // it is not an valid mobile number
//        Matcher m = p.matcher("6977355845");    // it is an valid mobile number
//        Matcher m = p.matcher("06977355845");  // it is an valid mobile number

        
//        if(m.find()){
//            System.out.println("Its is an valid mobile number");
//        }else System.out.println("Its is not an valid mobile number");


//        while(m.find()){
//            System.out.println(m.start());
//        }

//**********************************************************************************************************
//if my mobile number is of 12 digit 
//first two digit should be 1,9
        Pattern p = Pattern.compile("^(0|91)?[6-9][0-9]{9}$");    //1 and 9 may be or may not be 
//        Matcher m = p.matcher("6977355845");   // it is not an valid mobile number
//        Matcher m = p.matcher("916977355845");    // it is an valid mobile number
        Matcher m = p.matcher("6977355845");    // it is an valid mobile number

        
        if(m.find()){
            System.out.println("Its is an valid mobile number");
        }else System.out.println("Its is not an valid mobile number");


//        while(m.find()){
//            System.out.println(m.start());
//        }
    }
}
