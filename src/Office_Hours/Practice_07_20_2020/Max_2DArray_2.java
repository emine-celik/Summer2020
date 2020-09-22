package Office_Hours.Practice_07_20_2020;

import java.util.Arrays;

public class Max_2DArray_2 {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {8, 9, 11, 12},{13,14,20,15,16,17}};

        int max=arr2D[0][0];

        for( int[] each1D :arr2D){
            for(int eachNum  : each1D){

                if(eachNum>max){
                    max=eachNum;
                }

            }

            System.out.println("Maximum: "+max);


        }











    }
}
