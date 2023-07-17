/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.regex.*;
/**
 * \s
 * \S
 * \d
 * \D
 * \w
 * \W
 * \b
 * \B
*/
/**
 *
 * @author gopal
 */
public class PredefinedCharacterClasses {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\\s");  //only space will be counted
//        Matcher m = p.matcher("a7b k@6");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" , ");
////            output : 
////                      _
////                    "   at andex : 3"  
//        }
////**************************************************************************************************
//        Pattern p = Pattern.compile("\\S");  //Other than or Except space 
//        Matcher m = p.matcher("a7b k@6");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" , ");
////            output : 
////                    a at andex : 0 , 
////                    7 at andex : 1 , 
////                    b at andex : 2 , 
////                    k at andex : 4 , 
////                    @ at andex : 5 , 
////                    6 at andex : 6 , 
//        }
////**************************************************************************************************
//        Pattern p = Pattern.compile("\\d");  //only digit [0-9] 
//        Matcher m = p.matcher("a7b k@6");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" , ");
////            output : 
////                    7 at andex : 1 , 
////                    6 at andex : 6 ,  
//        }
////**************************************************************************************************
//        Pattern p = Pattern.compile("\\D");  //Other than digit , or except digit every character will be allowed 
//        Matcher m = p.matcher("a7b k@6");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" , ");
////            output : 
////                    a at andex : 0 , 
////                    b at andex : 2 , 
////                      at andex : 3 , 
////                    k at andex : 4 , 
////                    @ at andex : 5 , 
//        }
////**************************************************************************************************
//        Pattern p = Pattern.compile("\\w");  //every word [a-zA-Z0-9] except spacial character
//        Matcher m = p.matcher("a7b k@6");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" , ");
////            output : 
////                    a at andex : 0 , 
////                    7 at andex : 1 , 
////                    b at andex : 2 , 
////                    k at andex : 4 , 
////                    6 at andex : 6 , 
//         }
////**************************************************************************************************
//        Pattern p = Pattern.compile("\\W");  //Except word [a-zA-Z0-9], all spacial character allowed
//        Matcher m = p.matcher("a7b k@6");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" , ");
////            output : 
////                        at andex : 3 , 
////                      @ at andex : 5 ,
//        }
////**************************************************************************************************
//        Pattern p = Pattern.compile(".");  //Every thing 
//        Matcher m = p.matcher("a7b k@6");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" , ");
////            output : 
////                    a at andex : 0 , 
////                    7 at andex : 1 , 
////                    b at andex : 2 , 
////                      at andex : 3 , 
////                    k at andex : 4 , 
////                    @ at andex : 5 , 
////                    6 at andex : 6 ,
//        }
//**************************************************************************************************
//        String str = "gopalkushwah$gopal gopalkushwah gopal";
//        
////    g o p a l k u s h w  a  h  g  o  p  a  l     g  o  p  a  l  k  u  s  h  w  a  h     g  o  p  a  l
////    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 
//        Pattern p = Pattern.compile("\\bgopal");  //If given "gopal" word matched after any spacial character 
//        
//        Matcher m = p.matcher(str);
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start()+" end index : "+m.end()+" , ");
////            output : 
////                    a at andex : 0 , 
////                    7 at andex : 1 , 
////                    b at andex : 2 , 
////                      at andex : 3 , 
////                    k at andex : 4 , 
////                    @ at andex : 5 , 
////                    6 at andex : 6 ,
//        }
////**************************************************************************************************
        String str = "gopal$kushwahgopal gopalkushwah gopal";
        
//    g o p a l k u s h w  a  h  g  o  p  a  l     g  o  p  a  l  k  u  s  h  w  a  h     g  o  p  a  l
//    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 
        Pattern p = Pattern.compile("gopal\\b");  //If given "gopal" word matched before any spacial character 
        
        Matcher m = p.matcher(str);
        
        while(m.find()){
            System.out.println(m.group()+" at andex : "+ m.start()+" end index : "+m.end()+" , ");
//            output : 
//                    a at andex : 0 , 
//                    7 at andex : 1 , 
//                    b at andex : 2 , 
//                      at andex : 3 , 
//                    k at andex : 4 , 
//                    @ at andex : 5 , 
//                    6 at andex : 6 ,
        }
//**************************************************************************************************
    }
}
