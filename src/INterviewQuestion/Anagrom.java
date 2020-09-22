package INterviewQuestion;

import java.util.Arrays;

public class Anagrom {

    public static void main(String[] args) {
        System.out.println(anagram("arhZe", "Zehra"));


    }

    public static boolean anagram(String s1, String s2){
        if(s1.length() !=s2.length()){
            return false;
        }
        String[] sr1Arr= s1.split("");
        String[] sr2Arr = s2.split("");

        Arrays.sort(sr1Arr);
        Arrays.sort(sr2Arr);
        return Arrays.equals(sr1Arr,sr2Arr);

    }
}
