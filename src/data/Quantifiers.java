/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.regex.*;
/**
 *  a  =======> it will search for all "a" indivisualy
 *  a+ =======> at least one time "a"
 *  a* =======> zero or more times "a"
 *  a? =======> at most one "a"
 *  a{n} =====> if given character present in continuation for n time then it will give value
 *  a{n,}
 *  a{n,m}
 */
/**
 *
 * @author gopal
 */
public class Quantifiers {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("a");  //it will search for all "a" indivisualy
//        Matcher m = p.matcher("abaaacaav");
////                0.........a
////                2.........a
////                3.........a
////                4.........a
////                6.........a
////                7.........a
//        while(m.find()){
//            System.out.println(m.start()+"........."+m.group());
//        }
//===============================================================================================================
//        Pattern p = Pattern.compile("a+");  //at least one time "a"
                                            //if find "a" in continuation it will be consider as a single unit
//        Matcher m = p.matcher("abaaacaav");
////                0.........a
////                2.........aaa
////                6.........aa
//        while(m.find()){
//            System.out.println(m.start()+"........."+m.group());
//        }
////===============================================================================================================
//        Pattern p = Pattern.compile("a*");  //zero or more times "a"
//                                            //if find "a" in continuation it will be consider as a single unit, if not found the give value it will return "" (empty)
//        Matcher m = p.matcher("abaaacaav");
////                0.........a
////                1.........
////                2.........aaa
////                5.........
////                6.........aa
////                8.........
////                9.........
//        while(m.find()){
//            System.out.println(m.start()+"........."+m.group());
//        }
//////===============================================================================================================
//        Pattern p = Pattern.compile("a?");  //atmost one "a"
                                              //ya to ho bhi sakta hai ya nhi bhi
//        Matcher m = p.matcher("abaaacaav");
////                0.........a
////                1.........
////                2.........a
////                3.........a
////                4.........a
////                5.........
////                6.........a
////                7.........a
////                8.........
////                9.........
//        while(m.find()){
//            System.out.println(m.start()+"........."+m.group());
//        }
//////===============================================================================================================
//        Pattern p = Pattern.compile("a{2}");  //sirf 2 bar aaye , na isse jyada na kam
//        Matcher m = p.matcher("abaaacaav");
////            2.........aa
////            6.........aa
//        while(m.find()){
//            System.out.println(m.start()+"........."+m.group());
//        }
//////===============================================================================================================
////        Pattern p = Pattern.compile("x{2,}");  //2 bar ya usse jyada bar
//        Pattern p = Pattern.compile("x{3,}");  //3 bar ya usse jyada bar
//        Matcher m = p.matcher("xbxxxcbxxbaxxxx");
////                2.........xxx
////                11.........xxxx
//        while(m.find()){
//            System.out.println(m.start()+"........."+m.group());
//        }
//////===============================================================================================================
        Pattern p = Pattern.compile("x{2,3}");  // 2 ke barabar ya jyada and 3 se kam ya barabar
        Matcher m = p.matcher("xbxxxcbxxbaxxxx");
//            2.........xxx
//            7.........xx
//            11.........xxx
        while(m.find()){
            System.out.println(m.start()+"........."+m.group());
        }
////===============================================================================================================

    }
}
