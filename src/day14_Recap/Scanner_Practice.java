package day14_Recap;

import java.util.Scanner;

public class Scanner_Practice {
    /*
    task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Gender");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Country name: ");
        String countryName = input.next();

        System.out.println("Enter your zipcode: ");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name ");
        String fullName = input.nextLine();

        System.out.println("Enter your full company name");
        String companyName = input.nextLine();


    }
}
