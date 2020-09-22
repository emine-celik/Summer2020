package day30_CustomeMethods;

public class ReturnMethods {
    public static void main(String[] args) {
       // int num=addition1(3, 4);
        addition1(3,4);
        int sum1=  addition2(10,20);
        System.out.println(sum1);
        System.out.println(addition2(3,4)*2);
    }

    public static void addition1(int a,int b){
        int sum=a+b;  //   this value is not reusable

        System.out.println(sum);

    }

    public static int addition2(int a,int b){
        int sum1=a+b;


        return sum1;
    }





}
