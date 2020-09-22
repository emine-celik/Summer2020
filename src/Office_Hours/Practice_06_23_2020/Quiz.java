package Office_Hours.Practice_06_23_2020;

public class Quiz {
    public static void main(String[] args) {

        int score = 0;

        if (score==0) {
            //  0 == 0 ==> true
            score += 50;   //sore = score + 50; value of the score is 50;
        }

        if(score != 0){
         // 50 != 0 ==> true
         score += 50; // core = 100
        }

        System.out.println(score);
        System.out.println("============================");
        //q3
        char grade ='A';
        boolean passed = grade == 'A' || grade == 'B';
        //                'A' == 'A'
        //                  TRUE
        boolean passed2 = grade == 'C' || grade == 'D';
        //                  'A' =='C'   ||  'A' == 'D'
        //                   false     ||   false




    }
}
