package day54_Abstraction.AnimalTask;

public class Dog extends Animal{

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void play(){
        System.out.println(name+" is playin with balls");
    }

    public void jump(){
        System.out.println(name + " is jumping");
    }

    @Override
    public void drink() {
        System.out.println(name+" is drinking  wather");
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating beef");
    }

    @Override
    public String toString() {
        return "Dog " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color ;
    }
}
