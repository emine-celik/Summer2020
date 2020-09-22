package SELF_PRACTICE;
/*
2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
 */


import java.util.Scanner;

public class CyberIn1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to cyberin");
        int total=0;

        while(true){
            System.out.println("Please choose from folowing");

            System.out.println("King bed  120$");
            System.out.println("Queen Bed 100$");
            System.out.println(" single bed 80$");
            int option=scan.nextInt();

            switch (option){
                case 1:
                  total+= 120;
                  break;
                case 2:
                    total+=100;
                    break;
                case 3:
                    total+=80;
                    break;

            }
            System.out.println("Get out");
            System.exit(0);


            System.out.println("do you want another room");

        }



    }
}
