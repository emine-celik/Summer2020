package SELF_PRACTICE;

import org.w3c.dom.ls.LSOutput;

public class palindromeP1 {

    public static void main(String[] args) {
        String str="Kayak";
        String reversestr="";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversestr += str.charAt(i);

        }
        if(str.equalsIgnoreCase(reversestr)){
            System.out.println(reversestr +" is palindrome");
        }
        //  System.out.println(reversestr);

        System.out.println( palindromeP1("kayak"));

    }

    public static boolean palindromeP1(String str){
        String reversestr="";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversestr += str.charAt(i);

        }
       // if(str.equalsIgnoreCase(reversestr)){
       //     System.out.println(reversestr +" is palindrome");
       // }
        return str.equalsIgnoreCase(reversestr);


    }

}
