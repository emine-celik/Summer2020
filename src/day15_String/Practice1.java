package day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String firstName = input.next();
         char ch1 =firstName.charAt(0);

        System.out.println("Enter your last Nme");
         String lastName=input.next();
         char ch2 = lastName.charAt(0);

        System.out.println("Your initial is: "+ch1+ ch2);

        /*
        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(Str): concatenation
            String schoolName = "Cybertek";

                schoolName = schoolName.concat(" School");   //"Cybertek School"

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A'+true;   //123
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");

         */





    }
}
