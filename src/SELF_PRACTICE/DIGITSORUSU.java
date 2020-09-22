package SELF_PRACTICE;

import javax.management.MBeanAttributeInfo;
import java.util.Collections;

public class DIGITSORUSU {
    public static void main(String[] args) {


        String arr1 = "jav34ajs4jk6";
        int sum = 0;
        for (Character each : arr1.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);


    }
}
