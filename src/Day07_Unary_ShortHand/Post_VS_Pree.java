package Day07_Unary_ShortHand;

public class Post_VS_Pree {
    public static void main(String[] args) {

        int a = 10;
        System.out.println( ++a ); // 11
        System.out.println(a); //11


        System.out.println("===================================");
         // post
        int b = 10;
        System.out.println( b++ ); //10
        System.out.println(b); // 11

        System.out.println("====================================" );

        int c = 25;
        int d = c++; // d = 25; // this one is current value
        //  c= 26  // than add 1+25=26

        int x = 2;
        System.out.println(x++);
        System.out.println(x);

        int e = 8;
        int f = e--;
        System.out.println(e--);
        System.out.println(f);

        System.out.println("==========================");

        int A = 1;
        A = -A-- + A++ / -A-- * --A;


// POSTPHONE ; PAST THE CURRENT VALUE



      int B = 50;
      B = --B + B++ + B-- + B++; // B = 49
     // --B = 49 + CURRENT VAULE
     // B++ =  49
     // B-- = 50
     // B++ = 49

        System.out.println(B);


        int X = 4;
        int y = X * 4 - X++;


        System.out.println( X);





    }



}
