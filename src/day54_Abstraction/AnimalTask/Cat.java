package day54_Abstraction.AnimalTask;

public class Cat extends Animal{

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating bread ");
    }

    @Override
    public void drink() {
        System.out.println(name+" is drinking milk ");
    }

    @Override
    public String toString() {
        return "Cat " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color;
    }
}
