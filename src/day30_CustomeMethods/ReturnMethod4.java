package day30_CustomeMethods;

import java.util.Arrays;

public class ReturnMethod4 {
    public static void main(String[] args) {
        int[] a1={1,2,3,};
        int[] b2={4,5,6};

        int[] a3=combine2Arrays(a1,b2);
        System.out.println(Arrays.toString(a3));


    }


    public static int[] combine2Arrays(int[] arr1, int[] arr2) { // this method is reusebale with out a void,we create a int variable

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
}



