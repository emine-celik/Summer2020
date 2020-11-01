package INterviewQuestion.FourthDay;

public class remainder {

    public static void main(String[] args) {
        int result = rem(15,6);
        System.out.println(result);
    }


    public static int rem(int diveser, int diveder){
        int result = (diveder -diveser * (diveder/diveser));
        return result;

    }






}
