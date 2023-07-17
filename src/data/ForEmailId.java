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
public class ForEmailId {
    public static void main(String[] args) {
        
/**
 * first part of mail before @
 * first half may contains alphanumeric and _ and -
 * 
 * gopalkuswah  //valid
 * gopal-kushwah //valid
 * gopal_kushwah //valid
 * 2gopal_kushwah //valid
 * gopal123kushwah //valid
 * gopal#kushwah  //invalid
 * 
 */
//        Pattern p = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9_\\-]*$");
////        Matcher m = p.matcher("go-pal$_kushwah");  //invalid
//        Matcher m = p.matcher("go-pal_kushwah");   //valid
//        
//        if(m.find()){
//            System.out.println("Valid");
//        }else {
//            System.out.println("invalid");
//        }

//********************************************************************************************************
/**
 * Second half  after @ and before . symbol
 * 
 * may contains Alphanumeric characters
 * gamil     //valid
 * gmail12   //valid
 * gm435     //valid
 * gamil.   //invalid
 * gami_.   //invalid
 * gma-il.   //invalid
 * 
 */
//        Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
////        Matcher m = p.matcher("gmai-l");  //invalid
////        Matcher m = p.matcher("gma_il");  //invalid
////        Matcher m = p.matcher("gamil");   //valid
//        Matcher m = p.matcher("support");   //valid
//        
//        if(m.find()){
//            System.out.println("Valid");
//        }else {
//            System.out.println("invalid");
//        }

//********************************************************************************************************
/**
 * Third half after dot
 * .com //valid
 * .com.in //valid
 * .com.in.ap //valid
 * .com.in_ap //invalid
 * .com-in_ap //invalid
 */
//          Pattern p = Pattern.compile("^([.][a-zA-Z]+)+$");
////        Matcher m = p.matcher(".com.in");   //valid
////        Matcher m = p.matcher(".com.in.ap");   //valid
//        Matcher m = p.matcher(".com.in-ap");   //invalid
//        
//        if(m.find()){
//            System.out.println("Valid");
//        }else {
//            System.out.println("invalid");
//        }

//********************************************************************************************************
//********************************************************************************************************
/**
 * full gmail
 * gopal@gmail.com
 * gopal@support.com
 * gopal@support.com.in
 * gopal@support.com.in.ap
 */
          Pattern p = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9_-]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$");
//        Matcher m = p.matcher("gopal@gmail");   //invalid
//        Matcher m = p.matcher("gopal@gmail_com");   //invalid
//        Matcher m = p.matcher("gopal@gmail.com");   //valid
//        Matcher m = p.matcher("gopal@gmail.com.in");   //valid
//        Matcher m = p.matcher("12gopal@gmail.com.in");   //valid
//        Matcher m = p.matcher("12go_pa-l@gmail.com.in");   //valid
//        Matcher m = p.matcher("12go_pa-l12@gmail.com.in");   //valid
//        Matcher m = p.matcher("12go_pa-l12@gma_il.com.in");   //invalid
        Matcher m = p.matcher("12go_pa-l12@gmail.-com.in");   //invalid
        
        if(m.find()){
            System.out.println("Valid");
        }else {
            System.out.println("invalid");
        }

//********************************************************************************************************
    }
}
