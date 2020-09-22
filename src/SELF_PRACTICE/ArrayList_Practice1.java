package SELF_PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Practice1 {
    public static void main(String[] args) {


        java.util.ArrayList<Integer> nums=new java.util.ArrayList<>();

        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(5);

/*
        for (int i =nums.size()-1;i >=0 ; i--) {
            System.out.print(nums.get(i)+", ");
        }
        System.out.println();

        Collections.sort(nums);
        System.out.println(nums);

        int r= Collections.max(nums);
        System.out.println(r);

        int r2=Collections.min(nums);
        System.out.println(r2);
        System.out.println("=============================================");


        System.out.println("min number "+nums.get(0));
        System.out.println("max number "+nums.get(nums.size()-1));

*/


        System.out.println(nums.set(2,6)+nums.set(6,2));
        System.out.println(nums);


        //  nums.remove(5);
        // System.out.println(nums);

        // int w2= nums.indexOf(5);
        // System.out.println(w2);

        // int r2=nums.lastIndexOf(5);
        // System.out.println(r2);

        //boolean r3=  nums.contains(3);
        // System.out.println(r3);



        java.util.ArrayList<Integer> list=new java.util.ArrayList<>();
        list.addAll(Arrays.asList(10,11,12,34,54,1,10,1,11));

        System.out.println(list);
        java.util.ArrayList<Integer> unique=new ArrayList<>();
        for(int each:list){
            if(Collections.frequency(list,each)==1){
                unique.add(each);

            }

        }
        System.out.println(unique);

/*
        ArrayList <Integer> number = new ArrayList<>();
        number.add (10);
        number.add (1);
        number.add (13);
        number.add (120);
        number.add (11);
        number.add (0);
        number.add (0);
        number.add (0);
        number.add (120);
        System.out.println(number);
        ArrayList <Integer> unique = new ArrayList<>();
        for (int each : number) {
            if (Collections.frequency(number, each) == 1) {
                unique.add(each);
            }
        }
        System.out.println(unique);
    }
 */
}}
