package SELF_PRACTICE;

public class RemoveDupArray {
    public static void main(String[] args) {
        String[] arr={"a","b","c","c","b"};
        String nonDup="";

      /*  for (int i = 0; i <= arr.length-1 ; i++) {
         String  s=""+arr[i].charAt(i);

            if(!nonDup.contains(s)){
                nonDup+=s;

            }

        }

        System.out.println(nonDup);
        */

            for(String each: arr){

            if( !nonDup.equals(each)){
                nonDup+=each;
            }
        }
            System.out.println(nonDup);




    }
}
