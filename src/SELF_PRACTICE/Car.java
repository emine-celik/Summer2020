package SELF_PRACTICE;

public class Car {
   /* Attributes:
    model, brand, year, color, mileage, price

    */

    String model;
    String brand;
    int year;
    String color;
    double mileage;
    double price;



    public void setCarInfo(String model, String brand, int year, String color, double mileage, double price) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }



    public void getInfo(){
        System.out.println("Model: "+model+"\nBrand: "+brand+"\nYear: "+year+"\nColor: "+color+"\nMileage: "+mileage+"\nPrice: "+price);
    }

}
