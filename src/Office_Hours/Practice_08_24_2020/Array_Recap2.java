package Office_Hours.Practice_08_24_2020;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Array_Recap2 {
    public static void main(String[] args) {


      int[] nums = {2,3,4,5,6,7,8,};

      for(int each : nums){
          if(each % 3 == 0){
              System.out.println(each);
          }
      }
        for(int each : nums){
            if(each % 3 != 0){
               continue;
            }
            System.out.println(each);
        }
        System.out.println("====================================");

        String[] names = {"Emine","Zehra","Muhammed","Yusuf","Selma"};
        Arrays.sort(names);

        for(String each : names){
            if(each.toLowerCase().contains("m")){ // icinde "m" harfi olmayanlari output ta yazdirir
                System.out.println(each); // elementleri tek tek print yaparken Arrays.toString kurmaya gerek yok
            }
        }
        System.out.println( Arrays.toString(names) ); // Arrayin icinde ki tum elementleri yazdirmka icin toString methodu kullaniyoruz

        System.out.println("=====================================");

        int[] arr1={89,76,55,-100, 20, -200,100,1,45,3,90};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("======================================");

        int[] a1={1,2,3,4};
        int[] a2={1,2,3,4}; // it will give you TRUE

        System.out.println(Arrays.equals(a1,a2)); // checks elements at each indexes one by one

        int[] a3={1,2,3,4};
        int[] a4={1,2,4,3};
       // System.out.println(Arrays.equals(a3,a4)); // it will give you FALSE
         Arrays.sort(a3);
         Arrays.sort(a4); // if the arrays are equal each other it will give TRUE after you sort it
        System.out.println(Arrays.equals (a3,a4) );







    }
}
