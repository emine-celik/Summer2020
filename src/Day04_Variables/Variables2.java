package Day04_Variables;

public class Variables2 {
   /*
   // char: used for single character. character MUST be given in a single quote
   char: range of values =all unicode values from 0 to 65,535

    ASCI table

    */
   public static void main(String[] args) {
       char ch1 = 'A';
       char ch2 = 65;
       System.out.println(ch1);
       System.out.println(ch2);

       char ch3 = 35000;
       System.out.println(ch3);

      // char ch4 =66000; out of range

       char ch5 = 45876;
       System.out.println(ch5);

       char ch6 = 56879;
       System.out.println(ch6);

       char c1 ='A'; // 65
       char c2 ='B'; //66 =131

       //c1 + c2
       System.out.println(c1 + c2 );
       int result = c1 + c2 ; //131
       System.out.println(result);

       double d = c1 + c2;
       System.out.println(d);

       int num1 = 'A';
       System.out.println(num1);

       char c4 = 65+45;
       System.out.println(c4);

       char c5 = 'Z';
       char c6 = 897;
       System.out.println(c6);

       char c7 = '1';
       System.out.println( c7 + 1); //50 //you pass the char
       //                  '1'+ '1' = 50 (because in java each letters have number) asci table

       int r1 = c7;
       System.out.println(r1); //you pass the int

      //char ch1 = 'A' ;
      //EVERY SINGLE CHARS HAS ITS OWN CORRESPONDIN NUMBER

       System.out.println("======================================");
       char a1 = 'A';
       System.out.println('A');

       char a2 = '@';
       char a3 = 64;
       System.out.println(a2);
       System.out.println(a3);

       System.out.println('@' + 2); //=66

   }



}
