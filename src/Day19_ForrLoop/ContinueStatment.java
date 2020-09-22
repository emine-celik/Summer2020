package Day19_ForrLoop;

public class ContinueStatment {
    public static void main(String[] args) {
        for(int i=1; i <= 8; i++){  //i: 1, 2, 3, 4, 5

            if( i == 3 || i == 6){
                continue;  // jumps to the next iteration
            }

            System.out.print(i+" "); // 1  2  4 5

        }

        System.out.println("==============================");

        for(char ch = 'A'; ch <= 'F'; ch++){ // ch: A B C D E F

            if(ch == 'C' || ch == 'F') {
                continue;
            }

            System.out.print(ch +" ");

        }

        System.out.println();





    }
}
