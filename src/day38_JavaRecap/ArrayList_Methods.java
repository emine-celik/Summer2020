package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Infnity","Tesla","Wv","Lamborghini","Lexus","Tesla","Tesla"));

        // cars.remove(3); one way to remove
        // cars.remove("Tesla"); // it will remove first maching one, ONLY ONE
        //  cars.removeAll(Arrays.asList("Tesla")); // ==> removeALL <== from CollectionType we use Arrays,aslist()
        // removes all the maching one
        //   cars.removeIf(p -> p.toLowerCase().contains("m")); // eger m harfi varsa verilen kelimelerde hepsini icnden cikarir

        cars.retainAll(Arrays.asList("Tesla")); // removes all the NOT maching elements(only keeps the matching elements)

        System.out.println(cars);

        System.out.println("=============================================");

        ArrayList<String> shoppingList= new ArrayList<>();

        shoppingList.addAll(Arrays.asList("Egg","Milk","Paper Towels","Toilet Paper","Orange","Avacado"));
        boolean r1= shoppingList.contains("Pepsi"); // contains give you only one element
        System.out.println(r1);


        boolean r2=shoppingList.containsAll(Arrays.asList("Egg","Orange","Milk")); // you can check more than one elements it will give you  True/FALSE
        System.out.println(r2);

        System.out.println("Total Number of Items: "+shoppingList.size()); // size bize Arrayin icinde kac tane element var onu soyler

        shoppingList.set(shoppingList.size()-1,"Apple"); // set method bir elementi alip baska bir elementi onun yerine koyuyor
        System.out.println(shoppingList);

        shoppingList.set(shoppingList.indexOf("Paper Towels"),"Dish Washer"); // INDEXOF method ile "" kullanarak degisiklik yapabiliriz
        System.out.println(shoppingList);

        shoppingList.clear();  // CLEAR method listede ki herseyi temizledi, yani listenin sayisi 0 oldu
        System.out.println(shoppingList);










    }
}
