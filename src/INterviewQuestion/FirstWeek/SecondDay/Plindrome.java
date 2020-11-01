package INterviewQuestion.FirstWeek.SecondDay;

public class Plindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome("Kayak");
        System.out.println(result);
    }


    public static boolean isPalindrome(String str){
        String result = "";

        for (int i = str.toUpperCase().length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        if(str.equals(result)){
            return true;
        }
        return false;

    }

}
