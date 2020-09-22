package WurmUpStatic;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {

        String[] arr={"A","A","B","B","C","C","D","D","F","G","H"};

        String nunDup="";
        String unique=arr[0];

        for (int i = 0; i <= arr.length-1 ; i++) {
            if(!unique.contains(arr[i])){
                unique+=arr[i];
            }

        }
        System.out.println(Arrays.toString(unique.split("")));


        for(String each: arr){
            if(!nunDup.contains(each)){
                nunDup+=each;
            }
        }
        System.out.println(Arrays.toString(unique.split("")));







    }
}
