package Day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {
    public static int[]  sortDesc(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }

    // sorts int array in descending order and returns it

    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }
        return arr2;

    }

    // sorts double array in descending order and returns it

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }
        return arr2;

    }

    // sorts char array in descending order and returns it

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }
        return arr2;

    }

    // sorts String array in descending order and returns it

}
