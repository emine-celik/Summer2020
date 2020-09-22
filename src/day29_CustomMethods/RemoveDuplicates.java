package day29_CustomMethods;

import javax.swing.text.TabableView;

public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDup("abab");
    }

    public static void removeDup(String str){  //abab
        String nonDup=""; // "ab"


        for(String each  :str.split("")){
           if(! nonDup.contains(each)){
               nonDup+=each;
           }



        }

        System.out.println(nonDup);


    }





}
