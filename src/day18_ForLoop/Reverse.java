package day18_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
     /*
2. write a program that can reverse the following string:
                String str = "2. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt methodava";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
*/


        String str = "Python";
        Scanner scan= new Scanner(System.in);
        String str1 = scan.next();
        // avaJ ==> ava , J

        String s1 = str.substring(1);  //"ava"


            String result1 = s1+str; // "avaJ"

            System.out.println(result1);  /// ythonP
            System.out.println(result1);

            String firstName=scan.nextLine();
            String lastName=scan.nextLine();

    char ch1 = firstName.charAt(0);
    char ch2 = lastName.charAt(0);

    String initial ="" + ch1+ "." + ch2;
    initial =  initial.toUpperCase();
    String initial2 ="" + ch1+ "." + ch2;
    initial2 =  initial2.toUpperCase();

        System.out.println(initial);
        System.out.println(initial2);

}
// programming  ==> gnimmargorp















    }

