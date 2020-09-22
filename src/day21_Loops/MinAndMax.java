package day21_Loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int min = 999999999; // any user entered input WILL BE less than 999999999
        int max = -999999999;// any user entered input WILL BE greater than -999999999

        for( int i = 1; i <= 5; i ++){

            System.out.println("Enter a number");
            int num= scan.nextInt();


            if(num<min){
                min=num;
            }
             if(num>max){
                 max = num;
             }



        }

        System.out.println("Minimum number is: "+min);
        System.out.println("Maximum number is: "+max);















    }
}
