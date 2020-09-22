package day12_Switch_Scanner;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        /*
        write a program that can ask youser to enter two number, and the prints the sum of those two number
            Enter your first number
            10
            Enter your second number
            20
         */

   Scanner scan = new Scanner(System.in);
        System.out.println("Enter ypur first number: ");
        int a = scan.nextInt();
        System.out.println("Enter your second number: ");
        int b = scan.nextInt();
        System.out.println("Sum of those two numbers are: "+ (a + b));



    }
}
