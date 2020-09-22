package Day04_Variables;

public class CarInfo {
/* Year
   Brand
   Model
   Mileage
   Price

   print the info o the car
   Ex: 2020
       BWM
       X5
       30000
       45000

 OUTPUT:
     2020 BWM X5, 3000 miles, 45000$

 */
    public static void main(String[] args) {

        int year = 2017;
        String brand  = "BWM";
        String model = "X6";
        short mileage = 30_000;
        double price = 45_000;
        String color = "Black";

        //2020 BWM X5, 3000 miles, 45000$

        System.out.println(year+" "+brand+" " +model+" "+color+", "+mileage + " miles, $"+price);



    }





}
