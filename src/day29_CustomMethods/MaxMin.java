package day29_CustomMethods;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers={23,45,67,89,90,100,300};
        maxNum(numbers);
        minNumbers(numbers);
    }



    public static void maxNum(int[] arr){
        int max=arr[0];

        for(int each   :arr ){
            if(each> max){
                max=each;
            }
        }
        System.out.println("Max: "+max);



        }



public static void minNumbers(int[] arr1){
    int min =arr1[0];

    for(int each   :arr1 ){
        if(each< min){
            min=each;
        }
    }
    System.out.println("Min: "+ min);



}

}



