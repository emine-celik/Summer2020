package SELF_PRACTICE;

import org.w3c.dom.ls.LSOutput;

/*
1. create a method that can print odd numbers between 1~100 in a same line seperated by space
2. create a method that can print even numbers between 0~100
 */
public class Odd_EvenNumber {
    public static void main(String[] args) {

        oddNumber();
        evenNumber();
    }


    public static void oddNumber(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void evenNumber(){
        for (int i = 0; i <=100 ; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
    }



}
