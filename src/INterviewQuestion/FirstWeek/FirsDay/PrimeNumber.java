package INterviewQuestion.FirstWeek.FirsDay;

public class PrimeNumber {


    public static void main(String[] args) {
      boolean result=  primeNumber(18);
        System.out.println(result);
    }

    public static boolean primeNumber(int nums){

        if(nums <= 1) {
            return false;
        }
        if( nums == 2){
            return true;
        }
            for (int i = 2; i < nums; i++) {
                if(nums % i == 0){
                    return false;
                }
            }
            return true;


    }
}
