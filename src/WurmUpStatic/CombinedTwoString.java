package WurmUpStatic;

import java.util.Scanner;

public class CombinedTwoString {
    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        String str2=scan.next();

        char ch1=  str.charAt(str.length()-1);
        char ch2= ( str2.charAt(0));

       if(ch1 == ch2){
           System.out.println(str+str2.substring(1));
       }else{
           System.out.println(str+str2);
            }
             System.out.println(ch1);
        System.out.println(ch2);

*/

        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        String str2= scan.next();

        String s1= str.substring(str.length()-1);
        String s2= str2.substring(0,1);

        if(s1.equals(s2)){
            System.out.println(str+str2.substring(1));
        }else{
            System.out.println(str+str2);
        }













    }
}
