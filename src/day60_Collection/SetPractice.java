package day60_Collection;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String str = "aaaabbbbccccddddddeee";


        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        Set<String>s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr));

        System.out.println("=========================================");

        String a1 = "abcabc"; // a b c
        String a2 = "cab"; // a b c

        HashSet<String> b1 = new HashSet<>();
        b1.addAll( Arrays.asList(a1.split("")));

        System.out.println(b1);

        HashSet<String> b2 = new HashSet<>();
        b2.addAll( Arrays.asList(a1.split("")));
        System.out.println(b2);

        a1 = b1.toString();
        a2 = b2.toString(); // converting to string
        System.out.println(a1.equals(a2));
      //  System.out.println(b1.equals(b2));

        System.out.println("======================================================");

        String x1 ="cacacabb";
        String x2 = "bbcaaaaa";

       x1 = new TreeSet<> ( Arrays.asList(x1.split(""))).toString();
       x2 = new TreeSet<>(Arrays.asList(x2.split(""))).toString();

        System.out.println(x1.equals(x2));
        System.out.println("=======================================");

        String[] names ={"Alia","Mustafa","Elkem","Alia","Virginia"};
        LinkedHashSet<String > set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(names));

        names = set1.toArray(new String[0]); // converting collection type ti array

        System.out.println(Arrays.toString(names));
        System.out.println("=========================================");

        String[] name2 = {"Emine","Zehra","Emine","Yusuf","Yusuf","Muhammed","Yusuf"};

        name2 = new LinkedHashSet<>(Arrays.asList(name2)).toArray(new String[0]);
        System.out.println(Arrays.toString(name2));





















    }
}
