package day47_Encapsulations;

public class Constructor {
    static{
        System.out.println("Static block");
    }
    public Constructor(int a){
       // this(10); kendi kendini cagiramiyorsun
        System.out.println("int arg");
    }
    public Constructor(double a){
        this(10);  // Constructor cagirabiliyorsun
        System.out.println("double arg");
    }

    public Constructor(String a){
        this(5.5);
        System.out.println("String arg");
    }



    public static void main(String[] args) {

        new Constructor("A");














    }





}
