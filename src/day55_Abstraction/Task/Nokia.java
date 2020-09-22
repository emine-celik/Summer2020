package day55_Abstraction.Task;

public class Nokia extends Phone{


    public Nokia(String model, double price, String screenSize) {
        super(model, price, screenSize);
    }

    @Override
    public void call() {
        System.out.println(" Nokia is calling");

    }
    @Override
    public void text() {
        System.out.println(" Nokia is texting");
    }






}
