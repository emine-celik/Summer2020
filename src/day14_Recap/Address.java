package day14_Recap;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number");
        int buldingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.next();

        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();

        scan.nextLine();


        System.out.println("Enter your full name ");
        String fullName = scan.nextLine();

        System.out.println("\nShip to: "+fullName+"\n"+buldingNumber+" "+streetName+"\n"+cityName+", "+stateName+" "+zipCode);

    }
}
