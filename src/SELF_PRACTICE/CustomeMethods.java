package SELF_PRACTICE;

public class CustomeMethods {


    public static void main(String[] args) {
    sum(3,4,5,'-');

    }

    public static void sum(int num1,int num2,int num3,char operators){


        switch (operators){

            case '+':
                System.out.println("additon: "+(num1+num2+num3));
                break;
            case '-':
                System.out.println("Subtraction "+(num1-num2-num3));
                break;
            case '*':
                System.out.println("Multiplaction "+(num1*num2*num3));
                break;
            default:
                System.out.println("Invalid number");






        }



    }



}
