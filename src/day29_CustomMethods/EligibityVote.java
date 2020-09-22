package day29_CustomMethods;

import javax.xml.namespace.QName;

public class EligibityVote {

    /*
    age,citizen,name
     */
    public static void eligibleToBuyAlcohol(boolean hasID,int age){
        if(hasID &&age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You ar not eligible to buy alcohol");
        }

    }
    public static void main(String[] args) {
        vote("John",17,true,"Biden");
        vote("Emine",40,true,"Biden");
        eligibleToBuyAlcohol(true,21);
        calculator(100,'/',20);
    }

    public static void vote(String name,int age,boolean citizen,String presidentName){
        boolean eligibleToVote=   age>=18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote "+presidentName);
        }else{
            System.out.println(name+" is not eligible to vote");

        }
        System.out.println();
    }



    public static void calculator( double num1,char operator,double num2) {

      switch (operator){
          case '+':
              System.out.println("Addition: "+(num1+num2));
              break;
          case '-':
              System.out.println("Substraction"+(num1-num2));
              break;
          case '*':
              System.out.println("Multiplication: "+(num1*num2));
              break;
          case '/':
              System.out.println("Division: "+(num1/num2));
              break;
          case '%':
              System.out.println("Remainder: "+(num1%num2));
              break;

          default:
              System.out.println("Invalid Operator");

      }



    }
}