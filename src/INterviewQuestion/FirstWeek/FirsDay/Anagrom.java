package INterviewQuestion.FirstWeek.FirsDay;

import java.util.Arrays;

public class Anagrom {

    public static void main(String[] args) {
        System.out.println(anagram("arhZe", "Zehra"));

       // angram1("ayse","selma");
        System.out.println(angram1("aYse","Ayse"));


    }

    public static boolean anagram(String s1, String s2){
        if(s1.length() !=s2.length()){
            return false;
        }
        String[] sr1Arr= s1.toLowerCase().split("");
        String[] sr2Arr = s2.toLowerCase().split("");

        Arrays.sort(sr1Arr);
        Arrays.sort(sr2Arr);
        return Arrays.equals(sr1Arr,sr2Arr);

    }

    public static boolean angram1(String str,String str2){

        char ch[] = str.toLowerCase().toUpperCase().toCharArray();
        char ch2[] = str2.toLowerCase().toUpperCase().toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        return Arrays.equals(ch,ch2);

    }


}
