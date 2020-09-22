package SELF_PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindingUniqe_withArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,1,2,1,3,3,4,5,6,7,7));

        nums.removeIf(p -> Collections.frequency(nums, p)!=1);
                           // for the elements 

        System.out.println(nums);
    }
}
