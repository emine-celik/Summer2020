package SELF_PRACTICE.InstanceMethod;

import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Phone.*;
import day57_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {
    public static void main(String[] args) {
        Phone[] phone = {
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100)
        };

        ArrayList<Phone>phoneShop = new ArrayList<>(Arrays.asList(phone));
        int countIphone =0;
        int countSamsung =0;
        int countHuawei=0;

        // 1. ci yolu
        for (int i = 0; i <= phoneShop.size()-1 ; i++) {
            if(phoneShop.get(i) instanceof Iphone){
                countIphone++;
            }else if(phoneShop.get(i)instanceof Samsung){
                countSamsung++;
            }else{
                countHuawei++;
            }
        }
        // 2 inci yolu
       for(Phone each : phoneShop){
           if(each instanceof Iphone){
               countIphone++;
           }else if(each instanceof Samsung){
               countSamsung++;
           }else {
               countHuawei++;
           }
       }





        System.out.println("Ipone "+countIphone);
        System.out.println("Samsung "+countSamsung);
        System.out.println("Huawei "+countHuawei);
    }
}
