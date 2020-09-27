package day54_Abstraction.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat1= new Cat("Boncuk",2,"White");
        cat1.drink();
        cat1.eat();
        System.out.println(cat1);

        //Dog dog - new Dog("")
        System.out.println("===========================");


        Dog dog1= new Dog("Blue",1,"Black");
        dog1.eat();
        dog1.drink();
        dog1.play();
        dog1.jump();
        System.out.println(dog1);







    }



}
