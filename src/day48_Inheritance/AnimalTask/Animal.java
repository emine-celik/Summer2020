package day48_Inheritance.AnimalTask;

public class Animal {

    public String name;
    public String size;
    public int age;
    public String gender;
    public String breed;
    public double lb;

    public void setInfo(String name,String size,int age,String gender,String breed,double lb){
        this.name=name;
        this.size=size;
        this.age=age;
        this.gender=gender;
        this.breed=breed;
        this.lb=lb;

    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return "Animal name= " + name + " size= " + size + ", age=" + age + ", gender= " + gender+", breed= "+breed+" Weight= "+lb;
    }
}
