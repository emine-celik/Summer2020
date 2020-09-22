package Office_Hours.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = !true != true;
          //          false != true ==> true
        System.out.println(r1);

        boolean r2 = !r1;
        System.out.println(r2);
        System.out.println( !!!!!false ); // true

        System.out.println( !!!!!! true);

        System.out.println("=========================");
        // ||: either
        boolean result1 = 9 > 10 || "Java" == "Java" || 'A' =='a';
        //                false || true   ||  false

        System.out.println(result1);

        // &&
        boolean result2 = "Java" != "Python" && "Muhtar" != "Good Guy";
        //                  true && true

        System.out.println(result2);

        int a = 300;
        System.out.println( ++a ); // a =  301
        System.out.println( ++a ); // a = 302

        int b = 50;
        System.out.println( --b );   // b = 49
        System.out.println( --b ); // b = 48

        System.out.println("=======================");
        int x = 40;
        System.out.println( x-- ); // 40
        System.out.println( x );  // X = 39
        System.out.println( x-- ); // 39
        System.out.println( x ); // x = 38

        int y = 60;
        System.out.println( y++ ); // 60
        System.out.println( y );  // y = 61

        System.out.println( y++ ) ; // 61
        System.out.println( y ); // y = 62





    }
}
