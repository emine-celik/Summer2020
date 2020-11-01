package WurmUpStatic.Collection_Map;

import java.lang.reflect.Array;
import java.util.*;

/*
2. write a program that stores the unique characters from a string into map:

        Ex: "abacbdeef";
        output:
            {c=1, d=1, f=1}
 */
public class P2Collection {
    public static void main(String[] args) {


        String str ="abacbdeef";

        List<String> listCharacter= new ArrayList<>(Arrays.asList(str.split("")));

        Map<String,Integer> unique= new LinkedHashMap<>();

        for(String each: listCharacter){
            if(Collections.frequency(listCharacter,each) ==1){
                unique.put(each,Collections.frequency(listCharacter,each));
            }

        }
        System.out.println(unique);


    }


}
