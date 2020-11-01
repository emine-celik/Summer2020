package SELF_PRACTICE.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1= new Dog("Blue",3,'M');
        dog1.sleep();
        dog1.eat();
        dog1.bark();

        Cat cat1= new Cat("White",1,'F');
        cat1.eat();
        System.out.println("==============================");

       Animal animal1 =new Dog("Max",5,'M');
       animal1.sleep();
       animal1.eat();
      // animal1.bark(); its not in super class, it not referance type.polymorhsim

        Animal animal2 = new Cat("Boncuk",3,'F');

    }
}
