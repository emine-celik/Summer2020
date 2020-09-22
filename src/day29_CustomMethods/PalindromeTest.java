package day29_CustomMethods;
/*
redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer
 */
public class PalindromeTest {
    public static void main(String[] args) {
        palindrome("level");
    }

    public static void palindrome(String word){
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse.equalsIgnoreCase(word));
    }




}
