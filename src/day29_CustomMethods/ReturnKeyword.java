package day29_CustomMethods;

import org.w3c.dom.ls.LSOutput;

public class ReturnKeyword {

    public static void main(String[] args) {
        grade(101);
        grade(90);
        eligibleToBuy(17);
    }

    public static void grade(int score) {


        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
            // System.exit(0); exit the entire statement
        }
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
        System.out.println("Grade is: " + grade);

    }

    public static void eligibleToBuy(int age) {
        if (age < 21) {
            System.out.println("You are not eligible");
            return;
        }
        System.out.println("YOu are eligible to buy");
    }


}






