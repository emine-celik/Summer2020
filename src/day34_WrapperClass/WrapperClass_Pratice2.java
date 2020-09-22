package day34_WrapperClass;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class WrapperClass_Pratice2 {

    public static void main(String[] args) {


        int a=Integer.MAX_VALUE;
        System.out.println(a);

        byte b= Byte.MAX_VALUE;
        System.out.println(b);

        int c=Integer.MIN_VALUE;
        System.out.println(c);

        System.out.println("======================================================");
        Scanner scan=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            int n=scan.nextInt();  // 10,15,5,12,0;


            if(n> max){
                max=n;
            }

            if(n<min){
                min =n;
            }
        }

        System.out.println(max);
        System.out.println("Minnumber:  "+min);













    }






}
