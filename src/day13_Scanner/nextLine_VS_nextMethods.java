package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Enter Add another scan.nextLine method to take out enter from the scanner memory
        System.out.println("Enter your salary: ");// 120000
          double salary = scan.nextDouble();

          scan.nextLine(); // we use this to take out the Enters that are left in the scanner,so that we can use the next

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("Full Name: "+fullName);


    }
}
