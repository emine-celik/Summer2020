package INterviewQuestion.FirstWeek.FirsDay;

import java.util.Arrays;

//8.Write a method that takes an
// array of integers between 1 and 10 (excluding one number)
// and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9,10}; // 5
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        missing(arr);
        missing(arr1);

    }
    public static int intmissing_Number(int arr[]) {
        Arrays.sort(arr);
        if (arr[arr.length - 1] != 10) {
            return 10;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return arr[i] + 1;
            }
        }
        return 1;
    }

    public static void missing(int num[]){
        int sum =0;
        for (int i = 0; i <= num.length-1; i++) {
            sum += num[i];

        }
        System.out.println(sum);
    }
}
