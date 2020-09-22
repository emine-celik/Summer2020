package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Finding_Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
          nums.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));

        nums.removeIf(p-> Collections.frequency(nums,p) !=1);
                         // for the element that are not unique

        System.out.println(nums);
        System.out.println("==========================================================");
        ArrayList<Character> chars =new ArrayList<>();

        chars.addAll(Arrays.asList('a','b','c','3','4','5','6'));







    }
}
