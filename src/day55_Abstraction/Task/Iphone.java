package day55_Abstraction.Task;

public class Iphone extends Phone{



    public Iphone(String model, double price, String screenSize) {
        super(model, price, screenSize);
    }

    @Override
    public void text() {
        System.out.println(" Ipone is texting");
    }

    @Override
    public void call() {
        System.out.println(" Iphone is calling");

    }



}
