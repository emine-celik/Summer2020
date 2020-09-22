package day36_ArrayList;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {
       ArrayList<Integer> list2=new ArrayList<>();
        list2.add(30);
        list2.add(90);
        list2.add(10);
        list2.add(70);
        list2.add(40);

        Collections.sort(list2);
        for (int i=list2.size()-1;i>=0; i--) {
            System.out.print(" "+list2.get(i));

        }
        System.out.println();

        ArrayList<Integer>decendingList=new ArrayList<>();
        for (int i=list2.size()-1;i>=0; i--) {
           // System.out.print(" "+list2.get(i));
            decendingList.add(list2.get(i));

        }
        System.out.println(decendingList);


        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(30);
        list3.add(90);
        list3.add(10);
        list3.add(70);
        list3.add(40);

        Collections.swap(list3,0,list3.size()-1);
        System.out.println(list3);



    }
}
