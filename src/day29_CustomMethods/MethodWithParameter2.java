package day29_CustomMethods;
/*
 4. check eligibility to vote
    5. check eligibility to buy alcohol
    6. calculate the garde of the student based on the score
    7. create a method that can reverse any String

 */
public class MethodWithParameter2 {

    public static void main(String[] args) {
        vote(18);
        grades(89);
        reverseWord();
    }

    public static void vote(int age){

        if( age<age){
            System.out.println("You ara Eligble to Vote");
        }else{
            System.out.println("Not Eligble to Vote");
        }

        System.out.println();
    }

public static void grades(int score){
        if(score>=score ){
            System.out.println("Excellent");
        }else{
            System.out.println("Good");
        }
    System.out.println();
     }

     public static void reverseWord(){
        String word="Emine";
        for(int i=word.length();i>0;i--){
            System.out.println(word.substring(i));
        }
         System.out.println();
     }







}
