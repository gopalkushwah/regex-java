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
public class FirstRegx {
    public static void main(String[] args) {
        Integer count = 0;
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababacab");
        while(m.find()){
            count++;
            System.out.println("Start indx : "+m.start());  //it will return the exact starting index when it find ab
//            System.out.println(m.end());  // it will return (end index+1)
                                            // if we are finding ab in string ababacab
                                            // b is on the index a b a b a c a b  ==>  b on 2,4,8
                                            //                   0 1 2 3 4 5 6 7
            System.out.println("End indx : "+(m.end()-1));  // if we are finding ab in string ababacab
                                                            // b is on the index a b a b a c a b
                                                            //                   0 1 2 3 4 5 6 7
            System.out.println("Group : "+m.group());  // it will return the searching string group
            System.out.println("---------------------------------------------------------------------");
        }
        System.out.println("How many time : "+count);
    }
}
