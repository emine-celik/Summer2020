package WurmUpStatic;

import java.util.Arrays;

public class Array_Task {
    public static void main(String[] args) {

        String[] months={"Jan","Feb","March","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};

        System.out.println(months[0]);
        System.out.println(months[9]);

        String[] days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        System.out.println("Today is: "+days[5]);

        System.out.println("=====================================");

        int[] arr={4,5,6,7,1,-100,100,200,300,-3000};

        int max= arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
           if( arr[i] > max) {
               max=arr[i];

           }

           if(arr[i] < min){
               min=arr[i];
           }

        }

        System.out.println(max);
        System.out.println(min);
        System.out.println("=====================================");

        String [] group={"Emine","Ayhan","Ayse","Abdurrahim","Zehra"};

        int[] points={65,75,85,90,100};

        System.out.println(group[1]+ " point is: "+points[3]);
        System.out.println(group[0]+ " point is: "+points[4]);
        System.out.println(group[2]+ " point is: "+points[2]);
        System.out.println(group[4]+ " point is: "+points[1]);
        System.out.println(group[3]+ " point is: "+points[0]);

        for (int i = 0; i <= 4; i++) {
            System.out.println(group[i]+" "+points[i]);

        }


        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};

        int size= arr1.length + arr2.length;

        int[] arr3= new int[size];

        int index=0;
       for(int each:arr1){
        arr3[index]=each;
        index++;

       }

       for(int each: arr2){
           arr3[index]=each;
           index++;
       }

        System.out.println(Arrays.toString(arr3));

    }
}
