package INterviewQuestion.FourthDay;

import org.w3c.dom.ls.LSOutput;

public class Fibboniche {
    public static void main(String[] args) {
        fib(4);
    }


public static void fib(int num){

   int result=0;

    int a=0;
    int b=1;
    int c;

    if( result == 0){
        result=a;
    }

    for (int i = 2; i <= num ; i++) {

        c=a+b;
        a=b;
        b=c;
    }
   result =b;
    System.out.println(result);
}

}
