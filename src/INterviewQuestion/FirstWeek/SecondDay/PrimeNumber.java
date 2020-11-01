package INterviewQuestion.FirstWeek.SecondDay;

public class PrimeNumber { // sadece 1 re ve kendine bolunen rakamlar

    public static void main(String[] args) {
        boolean result = isPrime(14);
        System.out.println(result);
    }

    public static boolean isPrime(int num){
        //
        if( num <= 1){
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
}
