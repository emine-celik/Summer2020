package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestion {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","Muhtar","Ahmed","Ayse","Ferda","Ayse","Asli","Asli"));

        names.removeAll((Arrays.asList("Ahmed","Ayse")));
        System.out.println(names);





    }
}
