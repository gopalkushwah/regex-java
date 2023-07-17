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
public class CharacterClass1 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("[abc]");  //only a , b and c is allowed
//        Matcher m = p.matcher("a7b@z#9c");
//        
//        while(m.find()){
//            System.out.println(m.group()+" at andex : "+ m.start());   //a at andex : 0 , b at andex : 2 , c at andex : 7 
//        }
        Pattern p = Pattern.compile("[^abc]");  //other than a , b and c any value
        Matcher m = p.matcher("a7b@z#9c");
        
        while(m.find()){
            System.out.print(m.group()+" at andex : "+ m.start()+" , ");
//            output : 7 at andex : 1 , @ at andex : 3 , z at andex : 4 , # at andex : 5 , 9 at andex : 6
        }
    }
}
