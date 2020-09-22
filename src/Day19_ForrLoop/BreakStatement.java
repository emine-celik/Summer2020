package Day19_ForrLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 30) {
                break;
            }

            System.out.print(i + " "); // 10 20

        }

        System.out.println();

        System.out.println("=================================");

        for (int x = 1000; x >= 100; x -= 100) { // x: 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100

            System.out.print(x + " "); // 1000, 900, 800, 700, 600, 500

            if (x == 500) {
                break; // exits the loop

            }


        }

    }
}