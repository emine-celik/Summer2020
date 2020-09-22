package day48_Inheritance.AnimalTask;

import java.lang.reflect.AnnotatedArrayType;

public class    Dog    extends    Animal {
    //        sub(child)          super(parent) class


    public Dog(String name,String size,int age,String gender,String breed,double lb) {
        setInfo(name,size,age,gender,breed,lb);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }



}
