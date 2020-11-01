package INterviewQuestion.FirstWeek;

public class PrimeNumber {


    public static void main(String[] args) {
        int num=0;
       // primeNumber(21);
        System.out.println(primeNumber(2)); // kendine bolunen ve 1 bolunen rakamlar
    }

    public  static boolean primeNumber(int num){

         if( num <= 1){
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
