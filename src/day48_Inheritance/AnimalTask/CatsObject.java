package day48_Inheritance.AnimalTask;

public class CatsObject {
    public static void main(String[] args) {
        Cat cat1=new Cat("White","Small",2,"Male","Angora",2.5);

        cat1.meow();
        cat1.eat();
        cat1.sleep();
        System.out.println(cat1);

    }
}
