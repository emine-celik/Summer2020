package day26_MultiDimensionalArray;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Multid_Arrays {
    public static void main(String[] args) {

        char[] ch = {'A','B'};
        char[] ch1 = {'C','D','D'};
        char[] ch2 = {'F','G','H'};

        char[][] chD={  {'A','B'}, {'C','D','E'}, {'F','G','H'} };

        System.out.println(   Arrays.toString(chD[1]   ));
        System.out.println(  Arrays.toString(chD[2]   ));

        // H
        System.out.println(chD[2][2]);
        System.out.println(chD[1][0]);

        System.out.println(chD[2][1] +" "+ chD[0][1]);

        System.out.println("=====================================");
// {1,2,3} , {4} , {5,6},  {7,8,9, 10}

        //   int[] arr1D = {  {1,2,3}  };


        int[][]  nums = { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} };
        //                   0        1      2          3


        // [7,8,9, 10]
        System.out.println(  Arrays.toString( nums[3] ) );

        /*
        {1,2,3}
        {4}
        {5,6}
        [7,8,9, 10]
         */
      /*  System.out.println(  Arrays.toString( nums[0] ) );
        System.out.println(  Arrays.toString( nums[1] ) );
        System.out.println(  Arrays.toString( nums[2] ) );
        System.out.println(  Arrays.toString( nums[3] ) );
*/

    for(int i=0; i <= nums.length-1;i++){
        System.out.println(Arrays.toString(nums[i]));
    }


        // { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} }
        // System.out.println(Arrays.toString(nums));
        System.out.println( Arrays.deepToString(nums));








    }
}
