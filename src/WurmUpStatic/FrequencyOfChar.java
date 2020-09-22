package WurmUpStatic;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str="aabbcddeffg";
        String nundup="";



        for (int i = 0; i <=str.length()-1 ; i++) {
            String ch="" +str.charAt(i);
           if(!nundup.contains(ch)){
              nundup+=ch;
           }

        }
        System.out.println(nundup);

        char ch=nundup.charAt(0);
        int count=0;
        for (int i = 0; i <= str.length()-1 ; i++) {
            if(str.charAt(i)==ch){
                count++;
            }

        }
        System.out.println(""+ch+count);




    }
}
