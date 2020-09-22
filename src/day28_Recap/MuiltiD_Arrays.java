package day28_Recap;

import java.util.Arrays;

public class MuiltiD_Arrays {
    public static void main(String[] args) {
        int[] arr1D={1,2,3};
          //            0 2 3   0 1 2 3 4    0  1  2  3  4
        int[][] arr2D={{1,2,3},{4,5,6,7,8,},{9,10,11,12,13,}};
                    //   0         1             2

        System.out.println(Arrays.toString(arr2D[1]));     // single demensional int array
                                                          // Arrays.toString works only with singel array


      //  System.out.println(Arrays.deepToString(arr2D));   /// multidmensional arrays (use deeptoString)

        System.out.println(arr2D[1][3]);  // this one give you element

        System.out.println("===============================");

        for(int i =0; i<= arr2D.length-1; i++){
            int[] each1DArray =arr2D[i];
         //   System.out.println(Arrays.toString(each1DArray));

            for(int j = 0; j<= each1DArray.length-1;j++){ // iterates the element of each 1D array
                int eachNum=each1DArray[j];
                if(eachNum %2==0){
                    System.out.print(eachNum+" ");
                }

            }
            System.out.println();
        }
        System.out.println("=======================================");

        for( int[] each1D : arr2D  ){
            for(int eachElement:each1D){
                if(eachElement % 2 != 0)
                System.out.print(eachElement+" ");

            }
            System.out.println();
        }
     int count=0;
        for (int i = 0; i < 4 ; i++) {
            if(3==i){
                continue;
            }
            for (int j =i+1; j < 5; j++) {
                count++;
                if(3==j){

                }
            }

            System.out.print(count);
        }
        int[] arr={1,2,3,4,5,6,67,6};
        boolean[] barr=new boolean[arr.length];
        for (int i= arr.length-1;i>-1; i--) {
            if(arr[i]%2==0){
                barr[arr.length-1-i]=true;
            }

        }
        System.out.println(barr);
    }
}
