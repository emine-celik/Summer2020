package day31_Recap;
import Library.Util;
public class task {
    public static void main(String[] args) {

        String str2 = "wwweeeeerrrrrrrrrttttttttyyyyyyyuuuuuu";

        String expectedResult2 = frequencyOfChars(str2);

        System.out.println(expectedResult2);


    }


    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;

    }
}
