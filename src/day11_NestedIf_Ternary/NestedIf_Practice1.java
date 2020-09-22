package day11_NestedIf_Ternary;

public class NestedIf_Practice1 {
    public static void main(String[] args) {

        int days= 6;
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
        System.out.println("======================================");

        double salary = 120000;
        int jobHistory = 5;



        if(salary >= 30000 ){
            System.out.println("You are qualified");
            if(jobHistory >= 2){
                System.out.println("You must have been on job at least 2 years");
            }
        }else{
            System.out.println("You must earn at least $30K");
        }









    }
}
