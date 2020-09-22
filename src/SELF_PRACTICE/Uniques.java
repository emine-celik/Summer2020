package SELF_PRACTICE;

public class Uniques {
    public static void main(String[] args) {
        System.out.println(frequency("AABBCCDDE"));
    }

    public static String frequency(String str) {

        String nonDup = "";
        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println(nonDup);

        String result="";

       for(String each:nonDup.split("")){
           int count=0;

           for(String each1:str.split("")){
               if(each.equals(each1)){
                   count++;
               }
           }
           result+=" "+each+count;
       }
       return result;
    }









    }











