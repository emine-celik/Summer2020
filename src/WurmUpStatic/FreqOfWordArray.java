package WurmUpStatic;

public class FreqOfWordArray {
    public static void main(String[] args) {

        String[] arr={"A","A","B","B","C","C","D","D","F","G","H"};

        String nonDup="";

        for(String each : arr){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }








    }
}
