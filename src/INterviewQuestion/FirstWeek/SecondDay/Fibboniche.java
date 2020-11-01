package INterviewQuestion.FirstWeek.SecondDay;
/*
////7.In fibonacci series, next number is the sum of previous two numbers
// for example 0, 1, 1, 2,     3, 5, 8, 13, 21, 34, 55,  89,  144,……...
// The first two numbers of fibonacci series are 0 and 1.
// Given a number num, print n-th Fibonacci Number.
// the question is asking about the fibpnacci
 */
public class Fibboniche {

    public static void main(String[] args) {

       fibonacci(4);

      // ben buraya 4 yazdim o bana 5 nci indexi verdi
    }


    public static void fibonacci(int num){
        // 0 ,1,1,2,3,5,8 ben hangi numarayi yazarsam o bana bir sonraki fibonacchi numrasini veriyor
        int result=0;
        int a =0;
        int b= 1;
        int c;

        if(num == 0){
            result = a;
        }
        for (int i = 2; i <= num ; i++) {
            c = a+b;
            a=b;
            b=c;

        }
        result = b;

        System.out.println(result);
    }
}
