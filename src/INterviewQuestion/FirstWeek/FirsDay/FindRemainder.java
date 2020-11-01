package INterviewQuestion.FirstWeek.FirsDay;
//10.Can you write a method which finds
// remainder of 2 numbers without using the % operator?
public class FindRemainder {


    public static void main(String[] args) {

        int remainder =findReaminder(10,2);
        System.out.println(remainder);
    }

    public static int findReaminder(int dividend, int divisor){
        int remainder=0;


        remainder =(dividend -divisor*(dividend /divisor));

        //        10               2   * 5
        // 10 - 10 =0
        return remainder;

    }

}
