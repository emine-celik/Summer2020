package SELF_PRACTICE;

public class Unique {
    public static void main(String[] args) {
        String[] arr = {"A", "J", "B", "C", "C"};
        unique(arr);
    }


    public static void unique(String[] arr){

        for(String each:arr){
            int count=0;
           for(String num:arr){
               if(num.equals(each)){
                   count++;
               }
           }
           if(count==1){
               System.out.println(count);
           }
        }
    }











}
