package day22_NestedLoop;

import java.util.Scanner;

/*
 2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2

 */
public class OcucurancesOfChar {
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
     String str = scan.nextLine();
     char ch = scan.next().charAt(0);

      //  String str = "aaaaaaaaaaaaabbttaaa"; // this one is with out scanner

      //  char ch ='a';
        int count=0;
/*
        for(int i = 0; i <= str.length()-1; i++){
            char each =str.charAt(i); // a b a b c

            if(each == ch ){
                count +=1;
            }
}
   */

        int index =0;
        while (index<= str.length()-1){
            char each =str.charAt(index); // a b a b c

            if(each == ch ){
                count +=1;
            }
            index++;
        }
        System.out.println(count);






    }
}
