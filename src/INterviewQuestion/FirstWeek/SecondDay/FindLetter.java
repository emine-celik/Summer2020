package INterviewQuestion.FirstWeek.SecondDay;

import javax.swing.plaf.IconUIResource;

public class FindLetter {
    public static void main(String[] args) {

        // counthing the letter
        String str1 ="helllllo";
        findLetter(str1,'h');
        System.out.println();

    }

    public static void findLetter(String str,char ch){
        int num=0;
        for (int i = 0; i <= str.length()-1; i++) {

            char ch2=str.charAt(i);
            if(ch==ch2){
                num++;
            }

        }
        System.out.println(ch +" "+num);

    }





}
