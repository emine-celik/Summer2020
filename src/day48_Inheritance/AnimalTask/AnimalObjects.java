package day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {

       Dog  dog1= new Dog("Wilson","large",3,"Female","White",5.7);
       System.out.println(dog1.name);
       System.out.println(dog1.size);

      dog1.bark();
      dog1.eat();
      dog1.sleep();

      System.out.println(dog1.age);
      System.out.println(dog1.gender);
      System.out.println(dog1);

      Fish fish1 =  new Fish("Blue","Small",1,"Female","Japon",0.2);
      fish1.eat();
      fish1.sleep();
      fish1.swiming();
      System.out.println(fish1);

      Bird bird1 = new Bird("Blue","small",2,"male","kanarya",0.1);

      bird1.eat();
      bird1.sleep();
      bird1.sing();
        System.out.println(bird1);


    }
}
