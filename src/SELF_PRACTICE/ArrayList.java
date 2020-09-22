package SELF_PRACTICE;

import java.util.Arrays;
import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> studentName=new java.util.ArrayList<>();

        studentName.addAll(Arrays.asList("Emine","Ayhan","Ayse","Ferda","Emine","Ferda"));

        //  System.out.println(studentName);

        // Collections.sort(studentName);

        //Collections.swap(studentName,0,3);

        // int r= Collections.frequency(studentName,"Ayse");

      /*  ArrayList<Integer> nums= new ArrayList<>();

        nums.addAll(Arrays.asList(2,3,4,5,1,0,9,24,2,5,87));

        int r= Collections.min(nums);
        System.out.println(r);


        //option 2
        System.out.println("max number "+nums.get(0));
        System.out.println("min number "+nums.get(nums.size()-1));

*/
        //BULK OPREATION
        Collections.replaceAll(studentName,"Ferda","Selma");

        System.out.println(studentName);



    }
}
