package day11_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        int score = 100;
        String result = "";

        if(score >= 0 && score <= 100){ // valid score pre if condition

            if (score >= 90){
                result = "A";
            }else if(score >= 80){
                result = "B";
            }else if(score >= 70){
                result = "C";
            }else if(score  >= 60){
                result = "D";
            }else {
                result = "F";
            }
        }else{ // invalid score
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("===================================");

        int days= 5;
        String day = "1";

        if(days >= 1 && days <= 7){

        if(days == 1){
            day = "is Monday";
        }else if(days == 2){
            day = "is Tuesday";
        }else if(days == 3){
            day = "is Wensday";
        }else if(days ==4){
            day = "is Thursday";
        }else if(days == 5){
            day = "is Friday";
        }else if(days ==6){
            day = "is Saturday";
        }else{
            day = "is Sunday";
        }

        }else{
            day = "there is no such a day";
        }
        System.out.println(day);
        System.out.println("=======================================");
        








    }
}
