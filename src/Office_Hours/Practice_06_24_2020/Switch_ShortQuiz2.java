package Office_Hours.Practice_06_24_2020;

public class Switch_ShortQuiz2 {
    public static void main(String[] args) {

            //   boolean opt = true; Switch dos not work with boolean,long,float
           String opt = "true";
           switch ((opt)){
           // case true: when you have string you have to "" have the put it as a string
               case "true":
                   System.out.println("True");
                   break;
            default:
                System.out.println("False");
                break;


        }
        System.out.println("Done");





    }
}
