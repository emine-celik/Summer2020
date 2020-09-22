package SELF_PRACTICE;

public class Alcohol {
    public static void main(String[] args) {
        eligibletoBy(false,34);
        vote("Emine",21,true,true);
        vote("Zehra",17,false,false);
    }

    public static void eligibletoBy(boolean hasID,int age){
        if(age > 18 && hasID ){
            System.out.println("You are eligible to alcholl");
        }else{
            System.out.println("Invalid Id");
        }
    }

    public static void vote(String name,int age,boolean hasID,boolean citizen){
        if(age>18 && hasID && citizen){
            System.out.println("You are eligile to vote for Biden");
        }else{
            System.out.println("Invalid Info");
        }
    }









}
