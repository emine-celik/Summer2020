package SELF_PRACTICE;

import java.util.ArrayList;

public class MultiblyBy2 {
    public static void main(String[] args) {


        Integer arr[]={1, 2, 3, 4, 5};

    ArrayList<Integer> nums = new ArrayList<>();


        for (int each : arr) {
        if (each % 2 != 0) {
            nums.add(each * 2);
        }
            if (each % 2 == 0) {
                nums.add(each);
            }
        }
        System.out.println(nums);

}
}
