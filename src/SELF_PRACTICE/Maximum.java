package SELF_PRACTICE;

public class Maximum {
    public static void main(String[] args) {


    int a = 3;
    int b = 5;
    int c = 9;

    boolean aisMax = a > b && a > c;
    boolean bisMax = b > a && b > c;
    boolean cisMax = c > a && c > b;

   int max = 0;
       if(aisMax)

    {
        max = a;
    }else if(bisMax)

    {
        max = b;
    }else

    {
        max = c;
    }

        System.out.println("maximum number is "+max);

}
}
