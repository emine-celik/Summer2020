package SELF_PRACTICE;

public class PraticeCostume {
    public static void main(String[] args) {
        myName();
        age(2020, 1980);
        reverseName("Emine");
        removeDup("dirilis");

    }


    public static void myName() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Emine Celik");
        }
    }

    public static void age(int birthYear, int currentYear) {
        if (birthYear > currentYear) {
            System.out.println("INvalid");
        } else {
            System.out.println(currentYear - birthYear);
        }
    }


    public static void reverseName(String name) {

        String result = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            result += "" + name.charAt(i);

        }
        System.out.println(result);
    }

    public static void removeDup(String bookName) {
        String result = "";
        int count = 0;

        for (int i = 0; i <= bookName.length() - 1; i++) {
            String r2 = "" + bookName.charAt(i);

            if (!result.contains(r2)) {
                result += r2;
                count++;

            }
        }
        System.out.println(count);
        System.out.println(result);

        System.out.println("===================================");
    }






}
