package day23_Arrays;


import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "ABAB";  //"A2B2"
        String nonDup = "";  //"AB"
        String result = "";  //"A2B2"


        for(int i = 0; i <= str.length()-1; i++){
            String ch = ""+ str.charAt(i);  // A, B, A, B
            if(!nonDup.contains( ch )){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        // str ="ABAB"     nonDup = "AB"

        for(int j=0; j <= nonDup.length()-1; j++ ){

            char ch = nonDup.charAt(j); // A
            int count = 0; //2
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count+=1;
                }
            }

            result += ""+ch + count;

        }



        System.out.println(result);


  /*
        the reason we need nested loop:
         char ch1 = nonDup.charAt(0);  //B
            int count1 = 0; // frequnecy of B
            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch1){
                    count1++;
                }
            }
            expectedResult += ""+ch1 + count1;
             char ch2 = nonDup.charAt(0);  //C
            int count2 = 0; // frequnecy of C
            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch2){
                    count2++;
                }
            }
            expectedResult += ""+ch2 + count2;
             char ch3 = nonDup.charAt(0);  //D
            int count3 = 0; // frequnecy of D
            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch3){
                    count3++;
                }
            }
            expectedResult += ""+ch3 + count3;
         */


















    }

}
