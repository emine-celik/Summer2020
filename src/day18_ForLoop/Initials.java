package day18_ForLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
/*
    1. write a program that asks user's first and last name, then prints out the initials of the user
    input:
    cybertek
            batch18
    output:
    your initial is: CB
    DO NOT use charAt method
 */

            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
              /*
       String initial = firstName.substring(0, 1)+ "." + lastName.substring(0,1); // "jp"
               initial = initial.toUpperCase();  // "JP"

        System.out.println(initial);
       String initial1 = firstName.substring(0, 1)+ "." + lastName.substring(0,1); // "jp"
               initial1 = initial1.toUpperCase();  // "JP"

        System.out.println(initial1);

         */

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial ="" + ch1+ "." + ch2;
        initial =  initial.toUpperCase();
        String initial2 ="" + ch1+ "." + ch2;
        initial2 =  initial2.toUpperCase();

        System.out.println(initial);
        System.out.println(initial2);







    }
    }