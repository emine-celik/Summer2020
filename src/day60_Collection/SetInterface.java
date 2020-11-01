package day60_Collection;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {


        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(8,5,4,3,2,10,7,1, null)); // does not keep the insetion order
        s1.addAll(Arrays.asList(8,8,8,8,8,8,8,8)); // does not accept duplicates
        System.out.println("HashSet: "+s1);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,5,4,3,2,10,7,1, null));// keeps the insertion order as it is
        s2.addAll(Arrays.asList(8,8,8,8,8,8,8,8));// does not accept duplicates values
        System.out.println("Linked HasSet: " + s2);


        Set<Integer> s3 = new TreeSet<>();
        s2.addAll(Arrays.asList(8,5,4,3,2,10,7,1,null)); // does not accept null
        System.out.println("TreeSet: "+s3);


    }
}
