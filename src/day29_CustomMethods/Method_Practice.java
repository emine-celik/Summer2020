package day29_CustomMethods;

public class Method_Practice {
    public static void main(String[] args) {
        oddNumber();
        evenNumber();
        divisibleBy5();
        divisibleBy2();
    }


    public static void oddNumber(){
        for(int i=1;i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void evenNumber(){
        for(int i=0;i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

public static void divisibleBy5(){
        for(int i=0;i<=100;i++) {
            if (i % 5 == 0) {
                System.out.print(i+" ");

            }

        }
    System.out.println();
}

public static void divisibleBy2(){
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    System.out.println();
}



}
