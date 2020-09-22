package Office_Hours.Practice_08_24_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
addAll:
removeAll:
retainAll:
containAlla:
 */
public class Arraylist_Recap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,33,22,30,40,50));

        for(int each : list){
            System.out.println(each);
        }
        System.out.println("===============================");

        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(30,40,50,60,70,80,90,100,200));

       // remove: 40 ,50,90,200
        list2.removeAll(Arrays.asList(40,50,90,200));
        System.out.println();

        Collections.swap(list2,0,list2.size()-1); // swap method lementlerin yerlerini degistiriyor
        System.out.println(list2);

        System.out.println(list2.get(0));

        System.out.println(list2.get(list2.size()-1));

         // arr[0] =300;
        list2.set(0,300); // burada set method: arrayin 0 inci elementi alip 300 yerine koyuyor
        System.out.println(list2);

        Collections.sort(list2);// Arraylist i sort yapmak icin Collections utility kullaniyoruz
        System.out.println(list2);

        System.out.println("=================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","Emine","Zehra","Yusuf","Muhammed","Ayse","Ahmed"));

        names.removeIf(  p -> p.equals("Ahmed")  ); // removeIf method icine verdimiz objeyi listeden siler
        System.out.println(names);
        System.out.println("=================================");

        ArrayList<Integer> grades= new ArrayList<>();

        grades.addAll(Arrays.asList(50,65,45,55,75,85,95,98,100,87,40,52,62,35));

        Collections.sort(grades);

        grades.removeIf( p -> p < 60);
            System.out.println(grades);

        System.out.println("================================");
        ArrayList<String> students =  new ArrayList<>();

        students.addAll(Arrays.asList("Ahmed","Emine","Zehra","Yusuf","Muhammed","Ayse","Amina"));

        students.retainAll( Arrays.asList("Ahmed","Ayse"));

        System.out.println(students);











    }
}
