package day55_Abstraction.Task;

public class Samsung extends Phone{


    @Override
    public void text() {
        System.out.println(" Samsung is texting");
    }

    @Override
    public void call() {
        System.out.println(" Samsung is calling");

    }

    public Samsung(String model, double price, String screenSize) {
        super(model, price, screenSize);
    }

}
