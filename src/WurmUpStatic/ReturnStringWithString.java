package WurmUpStatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReturnStringWithString {
    public static void main(String[] args) {
        String str="aabbcdeeffgh";
        String nunDup="";

        for (int i = 0; i <= str.length()-1 ; i++) {
           String s=""+str.charAt(i);
            if(!nunDup.contains(s)){
                nunDup+=s;
            }
        }
        System.out.println("==================================");

        System.out.println(nunDup);

        for(char c:str.toCharArray()){
            if(!nunDup.contains(c+"")){
                nunDup+=c;
            }
        }
        System.out.println(nunDup);

        System.out.println("=================================");

        for(String each : str.split("")){
            if(!nunDup.contains(each)){
                nunDup+=each;
            }
        }
        System.out.println(nunDup);
        System.out.println("==============================");

        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList("aabbcdeeffgh"));

        list.removeIf( p -> Collections.frequency(list,p)==1);
        System.out.println(list);

        System.out.println("================================");

        String str1="aabbcdeeffgh";
        String[] s1 = str.split("");

        ArrayList<String>list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(s1));

        list1.removeIf(p -> Collections.frequency(list1, p ) > 1); // > bu bize nun dplicate olanlari verir
                                                     //    p)== 1 bu da bize duplictae olmayanalari verir
        System.out.println(list1); //

    }
}
