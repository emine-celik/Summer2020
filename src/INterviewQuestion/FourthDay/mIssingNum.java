package INterviewQuestion.FourthDay;

import java.util.Arrays;

public class mIssingNum {
    public static void main(String[] args) {

        int[] num = {1,2,4,6,7,9,5,8,10};
        System.out.println(missingNum(num));
    }

    public static int missingNum(int[] num){
        Arrays.sort(num);

        int missingNumber = 0;

        for (int i = 0; i < num.length ; i++) {
            if(num[i] != i+1){
                missingNumber = i+1;
                break;
            }
        }
        return missingNumber;
    }



}
