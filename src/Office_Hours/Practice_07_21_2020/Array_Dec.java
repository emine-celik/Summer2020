package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_Dec {
    public static void main(String[] args) {
        int[] arr={98,97,100,200,55,68,79};

        Arrays.sort(arr); //[55, 68, 79, 97, 98, 100, 200]

        System.out.println(Arrays.toString(arr));

        int[] decArr=new int[arr.length];
        decArr[0]=arr[6];
        System.out.println(Arrays.toString(decArr));







    }
}
