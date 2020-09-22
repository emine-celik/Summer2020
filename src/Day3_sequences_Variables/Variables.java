package Day3_sequences_Variables;
 /*
 declare variables:
 DataType variableName+ Data;

 0.3
 double a = 0.3;
 double TaxRate = 0.3;
 rules variable name; MUST be readable & meanigfull
            1. MUST  be unique ( cannot be duplicated)
            2. Needs to start with letters
            3. Variable name cannot contain any special character other then ($ and _)
            4. Cannot be java reserved word // like,new,trow,else,false,finally
            5. if variable name contains more than one word,we apply camelCase(prefered)
            double taxrate =0.3;
            double taxRate =0.3;

  */
public class Variables {
    public static void main(String[] args) {

        // length: 2, widht: 4, area: 8

        byte length= 2;
        byte width= 4;
        System.out.println(2*4); // * means multipla
        System.out.println(length*width);

        //length:11, width:12, area :
        System.out.println(length*width); //You dont have change to the number (length*width)

       //byte number betewen: -128 to +127
        //140
        //byte num1 =140; its not gonna work because 140 is not in byte

        short num2 =140;
         //short number betewen : -32,768 to 32,767
        //40000
       // short salary =40000; 40000; is greater than (short number)

        int salary =40000;
        // int is the prefered one in whole number
        //int largenumber =9999999999999; is greater than (int number)

        long largenumber = 999999999999l;  //when you add (L) it will recognized the long number

        int score = 100;
        System.out.println(score);

        //PI 3.14

        //byte PI = 3.14 because is not whole number dose not work wit byte,short,or int
        //short PI = 3.14
        //int PI = 3.14

         double PI =3.14;
        System.out.println(PI);

        float decimal1 = 3.5f; //add (F) at the and it will recognized as a float number










    }







}
