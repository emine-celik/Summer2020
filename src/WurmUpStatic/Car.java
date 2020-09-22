package WurmUpStatic;

public class Car {

    String brand;
    String model;
    int year;
    double price;
    String color;

    static boolean hasWheel=true;
    static boolean hasTire=true;

    public Car(String brand, String model, int year,double price, String color){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
        this.color=color;

    }

   public String toString(){
        return "Brand: "+brand+"\nModel: "+model+"\nYear: "+year+"\nPrice: "+price+"\nColor: "+color+"\nHas Wheel: "+hasWheel+"\nHas Tire: "+hasTire;
   }

}
