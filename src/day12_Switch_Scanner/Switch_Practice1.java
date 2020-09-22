package day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {
        /*  switch (num){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                // you don't have give a break; statement at the and
*/
        int num = 3;
        String result= "";

        switch (num){

            case 1:
            result=("Monday");
            break;
            case 2:
              result=("Tuesday");
                break;
            case 3:
                 result=("Wednesday");
                break;
            case 4:
                result=("Thursday");
                break;
            case 5:
                result=("Friday");
                break;
            case 6:
                result=("Saturday");
                break;
            case 7:
                result=("Sunday");
                break;
            default:
               result=("Invalid");
        }

        System.out.println(result);

        long c= 10;//10l
        float f= 10; // 10.0f
        double d= 10; // 10.0
        //SWITCH DOES NOT ACCEPT: BOOLEAN,DOUBLE,LONG AND BOOLEAN
    }
}
