package INterviewQuestion.FirstWeek.FirsDay;

import java.util.Arrays;

public class Sort1 {

    public static void main(String[] args) {

        // sort yapmadan Array i sort yaptik
        int arr[] ={1,2,3,4,6,9,4,3};
        int arr2[]=sortArrayWhitOutSort(arr);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] sortArrayWhitOutSort(int arr[]){
        // ilk for loop array leri gezdi
        for (int i = 0; i <= arr.length-1 ; i++) {
   // ikincisi de disardaki loopu bununla karsilastirdi
            for(int j = 0; j < arr.length-1 ;j++){
                int temp=0;

                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                   arr[i] = temp;
                }
            }

        }
        return arr;

    }
}
