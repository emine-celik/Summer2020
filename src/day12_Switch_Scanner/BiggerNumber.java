package day12_Switch_Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        double n1 = 90;
        double n2 = 70;
        double n3 = 10;

        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n1IsBigger == false && n2 > n3; // this way you can get same answer
                 //n2 > n1 && n2 > n3;
       boolean n3iIsBigger =!n1IsBigger && !n2IsBigger; // you dont have to have this

        /*String result = "";

        if(n1IsBigger){
           result=n1+ " is bigger";
        }else if(n2IsBigger){
            result = n2+ " is bigger";
        }else{
            result = "n3 is bigger";
        }
        System.out.println(result);
       */

        String resutl = (n1IsBigger)?"n1 is bigger" :(n2IsBigger)? "n2 Is Bigger" : "n3 Is Bigger";

        System.out.println(resutl);


    }
}
