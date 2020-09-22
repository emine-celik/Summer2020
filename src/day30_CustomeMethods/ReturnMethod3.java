package day30_CustomeMethods;

import java.util.Arrays;

public class ReturnMethod3 {
    public static void main(String[] args) {
        int[] arr={100,200,300,45,60,15};
       int maxNum=  max(arr);
        System.out.println(maxNum);
        System.out.println(maxNum > 300);
    }




    public static int max(int[] arr){

        Arrays.sort(arr);
        int max=arr[arr.length-1];
        return max;
    }







}
