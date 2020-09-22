package day09_IfStatement;

public class Breaks {
    public static void main(String[] args) {
         String itsBreakTime = "no";

         if(itsBreakTime == "yes"){
             System.out.println("Take 15 minutes of break");
         }else{
             System.out.println("continue the class");
         }

        System.out.println("==========================");

         int a =100;
         int b = 200;

         if (a > b){
             System.out.println(a+ " is greater");
         }else{
             System.out.println( b+ " is greater");
         }


    }
}
