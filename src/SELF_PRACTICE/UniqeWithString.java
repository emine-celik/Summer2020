package SELF_PRACTICE;

import jdk.swing.interop.SwingInterOpUtils;

public class UniqeWithString {
    public static void main(String[] args) {
       unique();


    }


    public static  void unique() {
        String str="AABBBCCADEFTH";

        String[] arr = str.split("");
        String unique1 ="";

        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++) {


                if (arr[i].equals(arr[i])) {
                    num++;
                }
                if (num == 1) {
                    unique1 += arr[j];
                }

            }

        }
        System.out.println(unique1);
    }  }

