package day31_Recap;
import Library.Util;

public class FrequancyOfCharacter {
    public static void main(String[] args) {
        String str="ABBBCCCA"; // ==> A2B3C3
        String expectedResult="";
        String nonDup=Util.removeDup(str);

        System.out.println("================================================");

        String str2="wwwwggggdddhhsttyddrp";
       String  expectedResult2 =frequencyOfChars(str2);
        System.out.println(expectedResult2);


        for(int i=0;i<=nonDup.length()-1;i++){

            char ch1=nonDup.charAt(i);
            int count= Util.frequency(str,ch1);
            expectedResult+=""+ ch1+count;

        }
        System.out.println(expectedResult);


       for(char each:nonDup.toCharArray()){
           int count= Util.frequency(str,each);
           expectedResult+=""+ each+count;

       }
        System.out.println(expectedResult);
    }

    public static String frequencyOfChars(String str2){
        String expectedResult2="";
        String nonDup=Util.removeDup( str2);

        for(char each:nonDup.toCharArray()){
            int count= Util.frequency(str2,each);
            expectedResult2+=""+ each+count;

        }
        return expectedResult2;
    }





}
