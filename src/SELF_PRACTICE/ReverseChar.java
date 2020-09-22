package SELF_PRACTICE;

public class ReverseChar {

    public static void main(String[] args) {

        String srs="Cybertek School";

        String result="";
/*
        for (int i = srs.length()-1; i >= 0 ; i--) {
           result+= srs.charAt(i);
        }

        System.out.println(result);
*/
        int i=srs.length()-1;

        for(String each:srs.split("")){
            result+=srs.charAt(i);
            i--;
        }
        System.out.println(result);









    }





}
