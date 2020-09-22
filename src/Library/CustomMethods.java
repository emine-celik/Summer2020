package Library;

public class CustomMethods {
    public static void removeDup(String str) {  //abab
        String nonDup = ""; // "ab"


        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }


        }

        System.out.println(nonDup);
    }
    // remove the duplicate

    public static void reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);


        }

        System.out.println(result);
    }
    // it reverse the variable


    public static void uniques(String[] arr) {

        for (String a : arr) { // gets each of the element

            int count = 0;
            for (String each : arr) { // gets the frequency of the element
                if (a.equals(each)) {
                    count++;
                }

            }

            if (count == 1) { // unique
                System.out.print(a + " ");

            }

        }
    }
}