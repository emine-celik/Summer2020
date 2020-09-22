package SELF_PRACTICE;

import java.util.Scanner;

public class Mix_Dup_Replace {
    public static void main(String[] args) {


            String word = "ababccddee";
            String nonDup = "";


            for (int i = 0; i <= word.length() - 1; i++) {
                String ch = "" + word.charAt(i);
                if (!nonDup.contains(ch)) {
                    nonDup += ch;


                }
            }
            System.out.println(nonDup);
            Scanner scan = new Scanner(System.in);
            String str = "hi code java please";
            int count = 0;
            for (int i = 0; i <= str.length() - 4; i++) {
                if (str.substring(i, i + 4).equals("java")) {
                    count++;
                }

            }
            System.out.println(count);


            System.out.println("==================================");
            String str2 = "breadjambread";
            String result = "";

            if (str.contains("bread")) {
                result += str2;

            } else {

            }

            System.out.println(result);
            System.out.println("============================");
            String sentence = scan.nextLine();
            int java = 0;
            int paython = 0;

            for (int i = 0; i <= sentence.length() - 1; i++) {
                if (sentence.contains("java")) {
                    sentence = sentence.replaceFirst("java", "");
                    java++;
                }
                if (sentence.contains("python")) {
                    sentence = sentence.replaceFirst("python", "");
                    paython++;
                }
            }
            if (java == paython) {
                System.out.println(true);

            } else {
                System.out.println(false);
            }


        }

    }
