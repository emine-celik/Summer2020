package day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name ");  // Emine
        String firstName = input.nextLine();
        char a = firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName =input.nextLine();
        char b = lastName.charAt(10);

        System.out.println("Enter your first and last letter " + a + b);


        String r2 = "Cybertek".concat("123");


        // toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
                 name1 = name1.toLowerCase();    // "cybertek school"

        System.out.println(name1);


        // toUpperCase():
        String name2 = "muhtar";
        name2 = name2.toUpperCase(); // "MUHTAR"

        System.out.println(name2);
        // (CAN WE HAVE MORE TASKS).tpLowerCase()

        System.out.println("========================");
        // (CAN WE HAVE MORE TASKS).tpLowerCase()


        // trim():
        String p = "     Cybertek       School    ";
        p =  p.trim();  // "Cybertek School"


        System.out.println(p);





    }

    }
