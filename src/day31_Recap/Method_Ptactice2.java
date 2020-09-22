package day31_Recap;

public class Method_Ptactice2 {

    public static void main(String[] args) {
        reverse1("levek");
        reverse2("level");
        System.out.println(reverse2("level"));

    }

    public static void reverse1(String str){
        String expectedResult="";
        for(int i=str.length()-1;i>=0; i--){
            expectedResult +=str.charAt(i);
        }
        System.out.println(expectedResult);
    }



    public static String reverse2(String str){
        String expectedResult="";
        for(int i=str.length()-1;i>=0; i--){
            expectedResult +=str.charAt(i);
        }
       return expectedResult;
    }






}
