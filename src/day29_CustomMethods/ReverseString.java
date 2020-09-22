package day29_CustomMethods;

public class ReverseString {

    public static void main(String[] args) {
        reverse("Emine");
    }

    public static void reverse(String word) {
        String result="";
        for(int i =word.length()-1;i>=0;i--){
            result+=word.charAt(i);


        }

        System.out.println(result);
    }

}


