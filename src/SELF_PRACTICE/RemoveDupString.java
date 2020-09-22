package SELF_PRACTICE;

public class RemoveDupString {
    public static void main(String[] args) {

        String word="khadrtgggkalellem"; // yeni olan str in icinde hangisi esit olmuyorsa bana resut a ekle

        String result="";
        for (int i = 0; i <word.length()-1 ; i++) {
            if(!result.contains(""+word.charAt(i))){ // yeni olan str in icinde hangisi esit olmuyorsa bana resut a ekle
                result+=" "+ word.charAt(i);
            }

        }
        System.out.println(result);

        System.out.println("=====================================");

        String word1="khadrtgggkalellem"; // yeni olan str in icinde hangisi esit olmuyorsa bana resut a ekle

        String result2="";
        for (int i = 0; i <word.length() -1; i++) {
            String s=" "+word.charAt(i);
            if(!result2.contains(s)){
                result2+=s;
            }

        }

        System.out.println(result2);
    }
}
