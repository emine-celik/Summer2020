package day13_Scanner;



import java.util.Scanner;

public class Next_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // next() use this method (Only  for ONE WORD)

        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println(firstName);
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName+ " "+lastName;

        System.out.println("Full name is : "+fullName);






    }
}
