package day11_NestedIf_Ternary;

public class DaysInMonth {
    /*
     2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
     */
    public static void main(String[] args) {
        int month = 4;

        boolean days28 = month == 2 ; // for the months that has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11; // for the months that has 30 days
       // boolean days31 = month == 1 || month == 2 || month == 5 || month == 7 || month == 8.....you dont have to just give the invalid is (less work)
        boolean invalid = month < 1 || month > 12;

       // days28== false && days30 == false && invalid ==false it means (31 days


        String  result = "";
        if(days28){
            result = "28 days";
        }else if(days30){
            result = "30 days";
        }else if(invalid){
            result = "invalid";
        }else{
            result = " 31 days";
        }

        System.out.println(result);

        System.out.println("========================");

         boolean x = true;
         boolean y= !x==false;
         boolean z = y;

         if(x){
             System.out.println("Hello Everyone");
         }if(y){
            System.out.println("Today is great day");

        }if (z){
            System.out.println("we are");
        }






    }

}
