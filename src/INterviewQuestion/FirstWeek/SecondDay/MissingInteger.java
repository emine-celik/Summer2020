package INterviewQuestion.FirstWeek.SecondDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
/8.Write a method that takes an array
of integers between 1 and 10 (excluding one number) and
returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
 */
public class MissingInteger {
    /*
    Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
Create a variable sum to store the sum of array elements.
Traverse the array from start to end.
Update the value of sum as sum = sum + array[i]
Print the missing number as sumtotal – sum

     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int count = arr.length; // array in length ini buldum
        System.out.println(count);

        int nums = missingNumber(arr, 9); // icine arrayimi ve kac tane numara oldugunu arrayde yazdim
        System.out.println(nums);
    }

    public static int missingNumber(int a[], int n) {
        int total;
        total = (n + 1) * (n + 2) / 2; // eksiksiz hali ( 9+1) * (9+2)/2
        //        10 * 11/ 2 = 55
        for (int j = 0; j < n; j++) {
            total -= a[j];

        }
        return total;
    }
    public static int sum(int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            count += i;

        }
        return count;
    }
    // sort yapmadan bu sekilde buluyoruz
}