package WurmUpStatic;

import java.util.Arrays;

public class CombineTwoString {
    public static void main(String[] args) {

        String[] name={"emine","zehra","Yusuf"};
        String[] name1={"Aslan","Abdur","Muhammed"};

        int size=name.length+name1.length;

        String[] name3=new String[size];
        int index=0;
       for(String each:name){
           name3[index]=each;
           index++;
       }
       for(String each:name1){
           name3[index]=each;
           index++;
       }
        System.out.println(Arrays.toString(name3));


       int[] num1={1,2,4,56,77,88,9,8,9};
       int[] num2={4,9,0,1,2,4,6,7,8,90,10,32,54,67};

       int size1=num1.length+num2.length;

      // Arrays.sort(num1);
      // Arrays.sort(num2);

       int[] num3=new int[size1];


       int index1=0;
       for(int each:num1){
           num3[index1]=each;
           index1++;
       }
       for(int each: num2){
           num3[index1]=each;
           index1++;
       }
        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));





    }
}
