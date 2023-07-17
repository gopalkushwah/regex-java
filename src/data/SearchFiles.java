/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.io.File;
import java.util.regex.*;
/**
 *
 * @author gopal
 */
public class SearchFiles {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$._]*[.]cpp");
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$._]*[.](java|class)");
//        File f = new File("D:\\C++ By Shushil Sir\\C++ 6pm");
        File f = new File("D:\\Java By Sushil sir");
        String[] s = f.list();
        Integer count = 0;
        for(String s1 : s){
            Matcher m = p.matcher(s1);
            if(m.find() && m.group().equals(s1)){
                System.out.println(s1);
                count++;
            }
        }
        System.out.println(count);
    }
}
