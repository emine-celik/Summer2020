package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;
import day58_Polymorphism.AnimlaTask.Animal;
import day58_Polymorphism.AnimlaTask.Cat;
import day58_Polymorphism.AnimlaTask.Dog;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 10; // implicit casting
        double  b=a;


        Dog dog1 = new Dog("A",2,'F');
        Cat cat1 = new Cat("A",2,'F');

        Animal animal2 = cat1; //  converting sub type to super type, ipmlicitly (upcasting)
        Animal animal = dog1; // done implicitly'



        System.out.println("===============================================");

        int x = 100;
        byte y =(byte ) x; // casting explicitly MUST be done manually

        Animal animal3 = new Dog("A",2,'F');
      //  animal3.bark(); downcasting olmadigi icin call yapamiyoruz

        Dog dog2 =(Dog) animal3; // downcasting
        dog2.bark();

        Animal animal4 = new Cat("A",2,'F');
     //   Dog dog3 = (Dog) anmal4;// is a relationship olmadigi icin cast yapamiyoruz. cat ile dog arainda is a relationship yok

        System.out.println("=============================================");
        Iphone iphone1 = new Iphone("12","6",12000);
        Phone phone2 = iphone1; // upcasting,implicitly

        Phone phone3 = new Samsung("S20","9",1100);
        Samsung phone4 = (Samsung) phone3;// manually, down casting




    }

}
