package day25_Practice;
/*
 Write a program that can return the longest string of text from a String array
 */
public class ptarctice {
    public static void main(String[] args) {

        String[] arr={"Merve","Zeynep","Abdurrahim"};
        int maxlength= arr[0].length();

        for(String each : arr){
           if( maxlength < each.length()){
               maxlength=each.length();
           }
        }
        System.out.println(maxlength);




    }
}
