package day54_Abstraction.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        Toyota toyota = new Toyota();
        Jeep jeep = new Jeep();
        Tesla tesla = new Tesla();

      bmw.start();
      tesla.start();
      toyota.start();
      jeep.start();


    }
}
