package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;

        byte t = 100;
        int z = t;

        //Integer z2 = t;

        Byte b1 =50;
        int  n1 = b1;

        byte b2 =40;
        //  Integer n2 =b2;

        Integer n3 = new Integer(123);

        Integer[] arr = new Integer[3];

        System.out.println( Arrays.toString(arr) );

        int p1 = 300;
        Integer p2 = p1; // Autoboxing

        Integer q1 = 500;
        int q2 = q1;   // unboxing


        // Double r1 = 300; // wrapper class is only dedicated to its primitive
        Double r1 = 300.0;
        double r2 = r1;  // unboxing

        long l1 = 400;
        Long l2 = l1; // autoboxing


        Float f1 = 100.5f;
        Float f2 = f1;

        int[] arr1 = {1,2,3,4};

        Integer[] arr2 = {1,2,3,4};
        for(int each  : arr2){
            System.out.println(each);
        }


        // double[] arr3 = {1,2,3,4,5,6,7};
        Double[] arr4 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};

        // Double y1 = 4;

        for(double  each: arr4){
            System.out.println(each);
        }

        char[] arr5 = {65, 67, 68,69};
        System.out.println(Arrays.toString(arr5));

        char ch = 79;
        Character ch2 = 79;

        System.out.println(ch2);


        String[] nums1 = {"12.5", "13.5", "14.5", "15.5"};

        double[] nums2 = new double[nums1.length];

        for( int i = 0; i <= nums1.length-1; i++){
            nums2[i] = Double.parseDouble(nums1[i]) ;
        }


        System.out.println(Arrays.toString(nums2));

    }
}
