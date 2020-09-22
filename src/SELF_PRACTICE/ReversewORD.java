package SELF_PRACTICE;

public class ReversewORD {
    public static void main(String[] args) {


        String word = "Emine";
        String result = "";

        for (int i =word.length()-1;i>=0; i--) {

            result+=""+word.charAt(i);

        }
        System.out.println(result);

    }
}
