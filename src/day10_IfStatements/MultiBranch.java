package day10_IfStatements;

public class MultiBranch {
    public static void main(String[] args) {

        double number =0;

        String pozitif = "";

        if (number > 0) {
            pozitif = number + " is positive";
        } else if (number < 0) {
            pozitif = number + " is negative";
        }else if(number == 0) {
            pozitif = number + "is not equel";
        }else
            pozitif = number + " is zero";
            System.out.println(pozitif);

        System.out.println("==================");
        /*
        public static void main(String[] args) {
        int number = 100;

        if(number > 0){
            System.out.println(number +" is positive");
        }

        if(number < 0){
            System.out.println(number+ " is negative");
        }

        if(number == 0){
            System.out.println(number + " is zero");
        }

        System.out.println("======================================");

        if(number > 0){
            System.out.println(number+" is positive");
        }else if(number < 0){
            System.out.println(number+" is negative");
        } else { // number ==0
            System.out.println(number +" is zero");
        }

         */







    }
}
