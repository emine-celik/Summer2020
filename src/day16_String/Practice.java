package day16_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Are you eployeed?");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }











    }
}
