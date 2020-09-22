package day37_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.addAll((Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9)));

     //   Predicate<Integer>lasThan5= p-> p < 5; boyle de kullanabiliriz


        list.removeIf(p -> p <5);
        System.out.println(list);

        System.out.println("============================================");
        Predicate<Integer> oddNumbers= p -> p %2 != 0; //finding odd number %2 !=0


        ArrayList<Integer> numbers= new ArrayList<>();
        for (int i = 0; i <=100 ; i++) {
            numbers.add(i);
        }
        numbers.removeIf(oddNumbers);
        System.out.println(numbers);

        System.out.println("====================================");

        Predicate<Integer> oddNumbers2= p -> p %2 == 0; //finding even number %2 ==0


        ArrayList<Integer> numbers1= new ArrayList<>();
        for (int i = 0; i <=100 ; i++) {
            numbers1.add(i);
        }
        numbers1.removeIf(P -> P % 2 ==0); //  remove it the number is even
        System.out.println(numbers1);

        System.out.println("=====================================");
        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Eminey","Emrey","Elify","Ayse","Hasan","Mary","Mehray"));
        names.removeIf(p -> p.startsWith("E") && p.endsWith("y"));

        System.out.println(names);






        }









    }

