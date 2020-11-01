package INterviewQuestion.FirstWeek.ThirDay;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,6,7,9,8,10};
        System.out.println(MisingNum(arr));
    }


    public static int MisingNum(int[] arr){
        int total=55;

        for (int i = 0; i < arr.length ; i++) {
            total -= arr[i];

        }
        return total;
    }

    // My FAVROTE

}
