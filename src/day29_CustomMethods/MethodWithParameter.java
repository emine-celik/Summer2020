package day29_CustomMethods;

import org.w3c.dom.ls.LSOutput;

public class MethodWithParameter {
    public static void main(String[] args) {
        printHello(5);
        oddNumber(100);
        printSunshine(6);
        age(1980,1979);
    }

    public static void printHello( int n){

        for(int i=0;i<n;i++){
            System.out.println("Hello World");

        }
        System.out.println();
     }



    public static void oddNumber(int n){
        for(int i=1;i<=n;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
     }

       public static void printSunshine(int s){
        for(int i=0;i<=s;i++){
            System.out.println("Sunshine");
        }
       System.out.println();
    }

      public static void age(int birthYear , int currentYear){
       if(currentYear<birthYear){
           System.out.println("Invalid Entry");
       }else{

           int age=currentYear -birthYear;
           System.out.println("You are "+age+" years old");

       }


    }








}
