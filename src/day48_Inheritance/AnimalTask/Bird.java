package day48_Inheritance.AnimalTask;

public class Bird extends Animal{

    public Bird(String name, String size, int age, String gender,String breed,double lb){
        setInfo(name, size, age, gender, breed, lb);
    }

    public void sing(){
        System.out.println(name+ " is singing");
    }

}
