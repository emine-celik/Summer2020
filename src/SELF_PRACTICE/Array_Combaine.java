package SELF_PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Combaine {
    public static void main(String[] args) {
        int[]a1={1,2,3,};
        int[] b1={4,5,6,7};
        int[] c=new  int[a1.length+b1.length];

        int i=0;

        for(int each:a1){
            c[i]=each;
            i++;
        }
        for(int each:b1){
            c[i]=each;
            i++;
        }

        System.out.println(Arrays.toString(c));

    }
}
