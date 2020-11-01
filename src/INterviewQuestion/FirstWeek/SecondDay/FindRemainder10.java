package INterviewQuestion.FirstWeek.SecondDay;

public class FindRemainder10 {

    public static void main(String[] args) {
        // find the remainder without % operator

        int result =remainder(17,5);
        System.out.println(result);
    }
    public static int remainder(int divended, int divisor){

        int remainder =0;
        remainder=(divended - divisor * (divended / divisor));
        return remainder;
    }


}
