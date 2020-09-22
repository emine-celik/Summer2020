package WurmUpStatic;

import java.util.Arrays;
import java.util.Scanner;

/*
rite a program for the room reservation:
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
public class Rezervasyon {
    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Inn");
        int option=scan.nextInt();
        double amount=scan.nextDouble();
       // double totalAmount=scan.nextDouble();

        System.out.println();


        switch (option){
            case 1:
                amount+=120;
                System.out.println("King Bed  120$");
                break;
            case 2:
                amount+=100;
                System.out.println("Queen Bed  100$");
                break;
            case 3:
                amount+=80;
                System.out.println(" Single Bed  80$");
                break;
            default:
                System.out.println("Sorry no room");
        }
        System.out.println(option);
        System.out.println(amount);
*/


        int[] arr={3,5,6,78,7,2,8,9};

        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min= arr[0];

        System.out.println(max);
        System.out.println(min);
        System.out.println(Arrays.toString(arr));


        String[] aLP={"A","D","F","T","E"};
        Arrays.sort(aLP);
        System.out.println(Arrays.toString(aLP));

/*
write a program that asks user how many numbers he wants to enter,
 and get all the user inputs and store them into an array variable,then  return maximum and minimum numbers
*/
       int[] nums={10,20,30};
       int max1=nums[0];
       int min1=nums[0];

        for (int i = 0; i <nums.length ; i++) {
            max1=nums[i];

        }
        System.out.println(max1);

        for (int i = 0; i <= nums.length-1 ; i++) {
            if(nums[i] < min1){
                min1=nums[i];
            }
            
        }
        System.out.println(min1);










    }
}
