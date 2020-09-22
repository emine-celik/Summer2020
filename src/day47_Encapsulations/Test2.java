package day47_Encapsulations;

public class Test2 {

    static int a=200;

    static {
        a=300;

    }

    public Test2(){
        a=400;
    }

    public static void main(String[] args) {

        Test2 obj = new Test2();//  eger bu sinifi olusturmasaydim once (300) exucuted olurdu.obje olmadan constructor not exucated
        System.out.println(a); // once static exucceted olur
    }
}
