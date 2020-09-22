package day48_Inheritance.AnimalTask;

public class Fish extends Animal{

    public Fish(String name, String size, int age, String gender,String breed,double lb){
        setInfo(name,size,age,gender,breed,lb);
    }

    public void swiming(){
        System.out.println(name + " is swiming");
    }

}
