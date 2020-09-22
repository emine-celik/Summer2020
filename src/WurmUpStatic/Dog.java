package WurmUpStatic;
/*
 Dog:
        attributes:
            breed, size, age, gender, name...

 */
public class Dog {

    String name;
    String breed;
    String size;
    int age;
    char gender;


   public Dog(String name,String breed,String size,int age, char gender){
       this.name=name;
       this.breed=breed;
       this.size=size;
       this.age=age;
       this.gender=gender;

   }
   public String toString(){
       return "Name: "+name+"\nBreed: "+breed+"\nSize: "+size+"\nAge: "+age+"\nGender: "+gender;
   }

}
