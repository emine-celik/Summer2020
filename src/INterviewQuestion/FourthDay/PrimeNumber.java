package INterviewQuestion.FourthDay;

public class PrimeNumber {


    public static void main(String[] args) {
        int num=0;

        System.out.println(primeNum(2));
    }





    public static boolean primeNum(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
