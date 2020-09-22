package day39_CustomeClass;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;
    String eat;
    String drink;
    String sleep;

    public void setDogInfo(String dogName,String dogBreed,String dogSize,int dogAge,String dogColor ){
        name=dogName;
        breed= dogBreed;
        size=dogSize;
        age=dogAge;
        color=dogColor;

    }

    public void getDogInfo(){
        System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+" years old ");
    }

// prints the dog info

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

 public void play(){
     System.out.println();
 }
    /*
  Dog:
    dog1: husky
    dog2: pitbull
    dog3: golden retriever
     */

}
