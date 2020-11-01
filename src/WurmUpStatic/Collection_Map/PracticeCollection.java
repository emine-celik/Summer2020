package WurmUpStatic.Collection_Map;

import java.util.*;

/*
1. Write a program that
stores the the character and
 frequency of each character from a String in to a Map

    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}

 */
public class PracticeCollection {

    public static void main(String[] args) {

        String str="aaabbbccb";

        List<String> listCharacter = new ArrayList<>(Arrays.asList(str.split("")));

       // Set<String> nounDup= new LinkedHashSet<>(list);

        Map<String , Integer>frequence= new LinkedHashMap<>();

        for(String each : listCharacter){
            frequence.put(each,Collections.frequency(listCharacter,each));
        }
        System.out.println(listCharacter);
        System.out.println(frequence);












    }




}
