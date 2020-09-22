package SELF_PRACTICE;

public class ArrayMax_Min {
    public static void main(String[] args) {


        int[] num = {1, 2, 3};

        int max=num[0];
        for(int each:num){
            if(each > max){
                max=each;

            }
        }
        System.out.println(max);

        int[] num1={3,6,8,9,2};

        int min=num1[4];
        for(int each: num1 ){
            if(each < min){
                min=each;
            }
        }

        System.out.println(min);

    }
}