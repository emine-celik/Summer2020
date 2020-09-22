package SELF_PRACTICE;

public class Dog {
   /* instance variables:
    name, breed, size, age, color
    instance methods:
    setDogInfo, getDogInfo, eat, drink, sleep


    */

    String name;
    String breed;
    String size;
    int age;
    String color;

    public  void setInfoDog(String name, String breed, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void getInfo(){
        System.out.println("Name: "+name+"\nBreed: "+breed+"\nSize: "+size+"\nAge: "+age+"\nColor: "+color);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
