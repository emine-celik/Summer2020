package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class Minumum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        int min=214748367;

        for(int i =1; i < 5;i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n>min){
                min=n;
            }
        }

        System.out.println("min: "+min);










    }
}
