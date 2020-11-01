package INterviewQuestion.FirstWeek.SecondDay;

public class Reverse {
    public static void main(String[] args) {
        String str2 ="hello world";
        reversed(str2);
    }

    public static void reversed(String str){
        String result="";

        for (int i = str.length()-1; i >= 0; i--) {
            result += ""+str.charAt(i);
        }
        System.out.println(result);
    }





}
