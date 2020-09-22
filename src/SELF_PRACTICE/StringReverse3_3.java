package SELF_PRACTICE;

import java.util.Arrays;

public class StringReverse3_3 {
    public static void main(String[] args) {

        String str2[]={"hello","kalem"};  // kalem i alip hello ile reverse yapiyor(harfleri degil)
        String rev[]=reverse(str2);
        System.out.println(Arrays.asList(rev));

    }


    public static String[] reverse(String[] arr) {
        String str1[] = new String[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            str1[j] = arr[i];
            j++;
        }
        return str1;
    }
    }
