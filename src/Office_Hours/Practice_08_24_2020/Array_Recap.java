package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    /*
    Array
    Collection
    Map
    Arrays Utility:
           toString: to print Array
           sort: ascending order
           equals: compares two arrays
           asList: to convert Object Arrays to Colletion Type

     */
    public static void main(String[] args) {

        int[] arr1= new int[5];
      //  System.out.println(arr1); not like this
          arr1[0] = 10;
          arr1[arr1.length-1]= 20;


        System.out.println( Arrays.toString(arr1) );

        int[] arr2 = {1,2,3,4,5};
        System.out.println( Arrays.toString(arr2) );

        System.out.println(arr2[1] * arr2[4]);

        System.out.println(arr2[0] * arr2[arr2.length-1]);

        System.out.println("=======================================");

        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

       /* for (int i = 0; i <= names.length-1 ; i++) {
            System.out.println("Enter a name");
            names[i] = scan.nextLine();
        }
*/
        for (int i = names.length-1; i >=0 ; i--) {    // reverse array
            System.out.println("Enter a name");
            names[i] = scan.nextLine();
        }


        System.out.println(Arrays.toString(names));













    }
}
