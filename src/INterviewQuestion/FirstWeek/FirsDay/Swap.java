package INterviewQuestion.FirstWeek.FirsDay;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b =5;
        swap(a,b);

        tepswap(10,5);
    }

    public static void swap(int a, int b){
        a= 10;
        b= 5;
         a= a+b; // 15
        System.out.println("A nin degeri: "+a);

        b = a - b;// 10
        System.out.println("B nin degeri: "+b);

        a= a-b; // 5
        System.out.println("A nin yeni degeri: "+a);
    }


    public static void tepswap(int x,int y){

        x=10;
        y=5;
        int c=0;

        c=x; //10
        x = y; //5
        y= c; //10

    System.out.println("x: "+x);
    System.out.println("y: "+ y);


}

}
