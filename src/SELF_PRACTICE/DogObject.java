package SELF_PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {

       Dog[] dogs={new Dog(),new Dog(),new Dog()};

        dogs[1].setInfoDog("Max","Bulldog","Large",3,"White");
        dogs[1].getInfo();
        dogs[1].drink();
        dogs[1].eat();
        dogs[1].sleep();
        System.out.println("======================================================");
        dogs[0].setInfoDog("Kiki","Sivas","Large",10,"Black");
        dogs[0].getInfo();
        System.out.println("============================================");
        dogs[0].drink();
        dogs[0].eat();
        dogs[0].sleep();

        dogs[2].setInfoDog("Cookie","German","Medium",2,"Gold");
        dogs[2].getInfo();
        System.out.println("=========================================");
        dogs[2].drink();
        dogs[2].eat();
        dogs[2].sleep();
        System.out.println("============================");

       ArrayList<Dog> dogArrayList=new ArrayList<>();

        dogArrayList.addAll(Arrays.asList(dogs[1],dogs[0],dogs[2]));

        for(Dog each: dogArrayList){
            each.getInfo();

        }


    }


}
