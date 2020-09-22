package day55_Abstraction.Task;

public abstract class Phone {

    public static String madeIn;
    public  String model;
    public double price;
    static String brand;
    static String operationSystem;
    public String screenSize;

public Phone(String model, double price,String screenSize){
    this.model=model;
    this.price=price;
    this.screenSize=screenSize;
}


    public abstract void text();
    public  abstract void call();

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}
