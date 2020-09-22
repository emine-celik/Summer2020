package day13_Scanner;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine(); //nextLine(); is very special
// we use this to take out the Enters that are left in the scanner,so that we can use the next
        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();

        System.out.println(buildingNumber+" "+streetName);


    }
}
