package Day19_ForrLoop;

import java.util.Scanner;

/*
 String str = "Cybertek School is a cool place";  // "rebyC"
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();  // "rebyC"
        //            01234

    //String result = ""+str.charAt( 4 ) + str.charAt(3) + str.charAt(2) + str.charAt(1) +str.charAt(0) ;
        String result = ""; //rebyC
        for(int i = str.length()-1 ; i >= 0; i-- ){ //i: 4, 3, 2, 1, 0
            result +=  str.charAt(i);
        }
        System.out.println(result);


 */
public class ReverseString {
    public static void main(String[] args) {

      //  String str ="Cyber";
       // int b = str.length()-1;

      //  for(int i=b; i >=0;i--){
       //     System.out.print(str.charAt(i));


        String str = "Cybertek";  // "rebyC"
        Scanner scan = new Scanner(System.in);
     //   String str = scan.nextLine();  // "rebyC"
        //            01234

        //String result = ""+str.charAt( 4 ) + str.charAt(3) + str.charAt(2) + str.charAt(1) +str.charAt(0) ;
        String result = ""; //rebyC
        for(int i = str.length()-1 ; i >= 0; i-- ){ //i: 4, 3, 2, 1, 0
            result +=  str.charAt(i);
        }
        System.out.print(result);






    }
}
