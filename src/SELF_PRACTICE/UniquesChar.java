package SELF_PRACTICE;

public class UniquesChar {
    public static void main(String[] args) {

        String str="ABBACCDEE";
        String result="";
        String nonDup="";

        for (int i = 0; i <= str.length() -1; i++) {
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);

        for (int i = 0; i <= nonDup.length()-1 ; i++) {


        }



    }
}
