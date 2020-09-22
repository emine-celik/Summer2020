package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(100,90,85,75,55,73,35,47,60,87,77,67,57,47,93,83,73,63,53));

        ArrayList<Integer> gradeA =new ArrayList<>();
        gradeA.addAll(list); // first store all the grades
        gradeA.removeIf(each -> each < 90); // second remove the grades that are not A.
        // only retain the grades A
        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer> gradeB =new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf( each -> each < 80 || each > 89);
        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer> gradeC =new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(each -> each < 70 || each > 79);
        System.out.println("Grade C: "+gradeC);

        ArrayList<Integer> gradeD =new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf( p -> p < 60 || p > 69);
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer> gradeF =new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf( p -> p > 59);
        System.out.println("Grade F: "+gradeF);

        System.out.println("=======================================");
        System.out.println(gradeA.size()+" student made A");
        System.out.println(gradeB.size()+" student made B");
        System.out.println(gradeC.size()+" student made C");
        System.out.println(gradeD.size()+" student made D");
        System.out.println(gradeF.size()+" student failed");






    }
}
