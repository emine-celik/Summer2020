package SELF_PRACTICE;

import java.util.Arrays;

public class FruquencyChar {

    public static void main(String[] args) {


        System.out.println( FrequencyOfChars("AAABBCDDD"));


    }


    public static String FrequencyOfChars(String str){

        String nunDup="";
        String expectedResult="";

        for (int i = 0; i <= str.length()-1; i++) {
            if (!nunDup.contains("" + str.charAt(i))) {
                nunDup += "" + str.charAt(i);

            }
        }
        System.out.println(nunDup);

                for (int j = 0; j <= nunDup.length()-1 ; j++) {
                    int count = 0;
                    char ch=nunDup.charAt(j);
                    for (int k = 0; k <= str.length() - 1; k++) {

                        if (str.charAt(k) == nunDup.charAt(j)) {
                            count++;
                        }
                        expectedResult +=nunDup.charAt(j) + " " + count;
                    }

                }
                return expectedResult;
            }}

 /*for(int j=0; j <= nonDup.length()-1; j++ ){

         char ch = nonDup.charAt(j); // A
         int count = 0; //2
         for(int i = 0; i <= str.length()-1; i++){
         if(str.charAt(i) == ch){
         count+=1;
         }
         }

         result += ""+ch + count;
*/













