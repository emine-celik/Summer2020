package INterviewQuestion.FirstWeek.FirsDay;

import jdk.swing.interop.SwingInterOpUtils;

////7.In fibonacci series, next number is the sum of previous two numbers
// for example 0, 1, 1, 2,     3, 5, 8, 13, 21, 34, 55,  89,  144,……...
// The first two numbers of fibonacci series are 0 and 1.
// Given a number num, print n-th Fibonacci Number.
// the question is asking about the fibpnacci
public class Fibonacci {
    public static void main(String[] args) {

    }

    public static  void fibonacci(int num){
        int result =0;
        int a=0; // first number
        int b=1; // second number
        int c; // this is the next number c = a + b =1

        if(num == 0){
            result =a;
        }
        for (int i = 2; i <= num; i++) {
            c = a+b; // c= 1
            a =b;  // 1
            b=c; // 1

        }
        result = b; // result b
        System.out.println(result);

        // reslutu b ye esitledim cunku bana c yi soruyor
        // soruda girilen indexten sonraki numarayi soruyo sayarken index 1 den basliyor
    }
}
