package Day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        int age = 12;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean elegibleAge = age >= 18;

        boolean r4 = true == !true; // false
        System.out.println(r4);

        //&&:
        boolean r5 = 9 > 5 && 9 > 10;
        //            true  &&  false

//   ||: or

        boolean r8 = true == !false || false == true;

        System.out.println(r8);

        boolean r9 = !false == false  || true == !false;
        System.out.println(r9);

        boolean r10 = !false == false  && true == !false;
        System.out.println( r10 );





        }
}
