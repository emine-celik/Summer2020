package SELF_PRACTICE;

import java.util.ArrayList;
import java.util.Collections;

public class duplicate {
    public static void main(String[] args) {


    String str = "AADDRRTY";
    String expectedResult = "";
    String uniqeus = "";

    ArrayList<String> list = new ArrayList<>();
        for(
    String each:str.split(""))

    {
        list.add(each);
    }
        System.out.println(list);
    String nonDup = "";
        for(
    int i = 0;
    i <=str.length()-1;i++)

    {
        String s = "" + str.charAt(i);
        if (!nonDup.contains(s)) {
            nonDup += s;
        }
    }
        System.out.println("Non dup: "+nonDup);
        for(
    String each:nonDup.split(""))

    {


        int count = 0;
        Collections.frequency(list, each);
        expectedResult += each + count;

        if (count == 1) {
            uniqeus += each;
        }

    }
        System.out.println(expectedResult);
}
}
