package SELF_PRACTICE;

public class Grade {

    public static void main(String[] args) {
        grade(80,"");











    }

    public static void grade(int score,String grade1) {
       /* String result="";
        if(grade <= 100){
            if(grade >= 90 ){
                result="Excelent";
            }else if(grade >= 80){
                result="Good";
            }else if(grade >= 70){
                result="Normal";
            }else if(grade >= 60){
                result="its ok";
            }

        }else{
            System.out.println("Invalid score");
        }
            System.out.println(result);
        }
*/
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
            // System.exit(0); exit the entire statement
        }

        String grade=(score>=90)?"Excellent":(score>=80)?"Good":(score>=70)?"Normal":(score>=60)?"Its ok":"Invalid";
        System.out.println(grade);

    }





     }













