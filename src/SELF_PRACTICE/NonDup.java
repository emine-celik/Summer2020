package SELF_PRACTICE;

public class NonDup {
    public static void main(String[] args) {

        String str="AABBCCDEAEF";

        String nonDup="";

        for (int i = 0; i <= str.length()-1 ; i++) {

            String ch= ""+str.charAt(i);

            if(!nonDup.contains(ch)){
                nonDup+=ch;

            }
        }
        System.out.println(nonDup);

        










    }
}
