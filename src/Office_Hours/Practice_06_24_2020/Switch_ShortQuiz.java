package Office_Hours.Practice_06_24_2020;

public class Switch_ShortQuiz {
    public static void main(String[] args) {

        int a = 10;
        switch(a){
            default:
                System.out.println("Friday");
                break;

            case 10:
                System.out.println("Monday");
               break;// break;  we dont have a break statement and betewen {} it will print all the statement
            case 11:
                System.out.println("Tuesday");
              break;
            case 12:
                System.out.println("Wednesday");
                break;


            // defult statement you can put it whereever you want,but if case: have a break its matter
        }



    }
}
