package day35_ArraysList;

public class SumOfDigits {
    public static void main(String[] args) {

        String str ="a1b2c3d4e5f6";


        for (int i = 0; i <= str.length()-1 ; i++) {
         char each =   str.charAt(i);
         if(each>= 48 && each<=57){      //iff the char is between 48/57, then its digit

             System.out.print(" "+Integer.parseInt(""+each));    // convert the char to Integer then and it add to the sum

         }
        }


    //  burada digitleriin toplami istenmis sadece







    }
}
