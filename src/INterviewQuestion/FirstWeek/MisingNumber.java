package INterviewQuestion.FirstWeek;

import java.util.Arrays;

public class MisingNumber {

    public static void main(String[] args) {
        int[] num ={1,3,5,2,6,7,9,8,10};
        int[] num1={3,2,4,5,6,7,8,9,10};
        System.out.println("num = " +missinNumber(num));
        System.out.println("missinNumber(num1 = " + missinNumber(num1));
    }

    public static int missinNumber(int[] num){
        Arrays.sort(num);
        int missingNum = 0;

        for (int i = 0; i < num.length ; i++) {
            if(num[i] != i+1){
                missingNum=i+1;
                break;
            }
        }
        return missingNum;
    }
}
