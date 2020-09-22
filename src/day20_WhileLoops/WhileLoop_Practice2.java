package day20_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        int num1=10;

        while(num1 < 15 ){

            System.out.print("Emine ");


            num1++;
        }

        System.out.println();
        System.out.println("=====================================");
        int num = 0;
        while (num<=10-1){
            System.out.print("Celik"+" ");
          num++;
        }

        System.out.println();
        System.out.println("=======================================");


    /*    String name ="EMine ";
        int index = name.length()-1;
        String result ="";

        while(index >= 0){

         result  += name.charAt(index);
            System.out.println(index);
           index--;
        }
*/


        String str = "Cybertek School";
        //            01234567

        String result = "";

        int index = str.length() -1;
        while(index >= 0){

            result += str.charAt(index);

            index--;
        }


        System.out.println(result);






    }
}
