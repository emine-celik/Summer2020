package day31_Recap;
/*
warmup tasks:
    1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop

 */
public class WarmupTask {

    public static void main(String[] args) {
        String str="aabcccd";
        String uniques="";


        int count=frequency(str,'a');
        System.out.println(count);
    }



    public static int frequency(String str,char ch){ //finds the frequency of each char from String str
        int count=0;
        for(char each:str.toCharArray()){
            if(each==ch){
                count++;
            }
        }
       return count;

    }


}
